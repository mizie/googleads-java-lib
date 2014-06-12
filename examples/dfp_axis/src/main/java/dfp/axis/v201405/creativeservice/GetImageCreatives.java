// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201405.creativeservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201405.StatementBuilder;
import com.google.api.ads.dfp.axis.v201405.Creative;
import com.google.api.ads.dfp.axis.v201405.CreativePage;
import com.google.api.ads.dfp.axis.v201405.CreativeServiceInterface;
import com.google.api.ads.dfp.axis.v201405.ImageCreative;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all image creatives. To create creatives, run
 * CreateCreatives.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CreativeService.getCreativesByStatement
 *
 * @author Adam Rogal
 */
public class GetImageCreatives {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the CreativeService.
    CreativeServiceInterface creativeService =
        dfpServices.get(session, CreativeServiceInterface.class);

    // Create a statement to only select image creatives.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("creativeType = :creativeType")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("creativeType", ImageCreative.class.getSimpleName());

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get creatives by statement.
      CreativePage page = creativeService.getCreativesByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Creative creative : page.getResults()) {
          System.out.printf(
              "%d) Creative with ID \"%d\" and name \"%s\" was found.\n", i++,
              creative.getId(), creative.getName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d\n", totalResultSetSize);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
