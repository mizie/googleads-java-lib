
package com.google.api.ads.dfp.jaxws.v201405;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving {@link LiveStreamEvent}
 *       objects.
 *       <p>
 *       This feature is not yet openly available for DFP Video publishers.
 *       Publishers will need to apply for access for this feature through their
 *       account managers.
 *       </p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LiveStreamEventServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LiveStreamEventServiceInterface {


    /**
     * 
     *         Creates new {@link LiveStreamEvent} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link LiveStreamEvent#name}</li>
     *         <li>{@link LiveStreamEvent#startDateTime}</li>
     *         <li>{@link LiveStreamEvent#endDateTime}</li>
     *         <li>{@link LiveStreamEvent#contentUrls}</li>
     *         <li>{@link LiveStreamEvent#adTags}</li>
     *         </ul>
     *         
     *         @param liveStreamEvents the live stream events to create
     *         @return the created live stream events with their IDs filled in
     *       
     * 
     * @param liveStreamEvents
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201405.LiveStreamEvent>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
    @RequestWrapper(localName = "createLiveStreamEvents", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", className = "com.google.api.ads.dfp.jaxws.v201405.LiveStreamEventServiceInterfacecreateLiveStreamEvents")
    @ResponseWrapper(localName = "createLiveStreamEventsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", className = "com.google.api.ads.dfp.jaxws.v201405.LiveStreamEventServiceInterfacecreateLiveStreamEventsResponse")
    public List<LiveStreamEvent> createLiveStreamEvents(
        @WebParam(name = "liveStreamEvents", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
        List<LiveStreamEvent> liveStreamEvents)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link LiveStreamEventPage} of {@link LiveStreamEvent} objects that
     *         satisfy the given {@link Statement#query}. The following fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link LiveStreamEvent#id}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement to filter a
     *         list of live stream events
     *         @return the live stream events that match the filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201405.LiveStreamEventPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
    @RequestWrapper(localName = "getLiveStreamEventsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", className = "com.google.api.ads.dfp.jaxws.v201405.LiveStreamEventServiceInterfacegetLiveStreamEventsByStatement")
    @ResponseWrapper(localName = "getLiveStreamEventsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", className = "com.google.api.ads.dfp.jaxws.v201405.LiveStreamEventServiceInterfacegetLiveStreamEventsByStatementResponse")
    public LiveStreamEventPage getLiveStreamEventsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link LiveStreamEvent} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param liveStreamEventAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of live stream events
     *         @return the result of the action performed
     *       
     * 
     * @param liveStreamEventAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201405.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
    @RequestWrapper(localName = "performLiveStreamEventAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", className = "com.google.api.ads.dfp.jaxws.v201405.LiveStreamEventServiceInterfaceperformLiveStreamEventAction")
    @ResponseWrapper(localName = "performLiveStreamEventActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", className = "com.google.api.ads.dfp.jaxws.v201405.LiveStreamEventServiceInterfaceperformLiveStreamEventActionResponse")
    public UpdateResult performLiveStreamEventAction(
        @WebParam(name = "liveStreamEventAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
        LiveStreamEventAction liveStreamEventAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link LiveStreamEvent} objects.
     *         
     *         @param liveStreamEvents the live stream events to update
     *         @return the updated live stream events
     *         @throws ApiException if there is an error updating the live stream events
     *       
     * 
     * @param liveStreamEvents
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201405.LiveStreamEvent>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
    @RequestWrapper(localName = "updateLiveStreamEvents", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", className = "com.google.api.ads.dfp.jaxws.v201405.LiveStreamEventServiceInterfaceupdateLiveStreamEvents")
    @ResponseWrapper(localName = "updateLiveStreamEventsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", className = "com.google.api.ads.dfp.jaxws.v201405.LiveStreamEventServiceInterfaceupdateLiveStreamEventsResponse")
    public List<LiveStreamEvent> updateLiveStreamEvents(
        @WebParam(name = "liveStreamEvents", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
        List<LiveStreamEvent> liveStreamEvents)
        throws ApiException_Exception
    ;

}
