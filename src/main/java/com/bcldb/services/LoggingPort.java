// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "LoggingPort", targetNamespace = "urn:LogService")
@SOAPBinding(parameterStyle = ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface LoggingPort {
    @WebMethod(action = "urn:LogService/getVersionInfo")
    @WebResult(name = "GetVersionResponse", targetNamespace = "http://common.services.bcldb.com", partName = "return")
    GetVersionResponse getVersionInfo(
            @WebParam(name = "GetVersionInfoRequest", targetNamespace = "http://common.services.bcldb.com", partName = "part") EmptyRequestType var1)
            throws ErrorMessage;

    @WebMethod(action = "urn:LogService/addEvent")
    @WebResult(name = "servicePostResponse", targetNamespace = "http://type.common.services.bcldb.com", partName = "return")
    PostServiceResponseType addEvent(
            @WebParam(name = "PostEventRequest", targetNamespace = "http://logservice.services.bcldb.com", partName = "part") PostEventRequest var1)
            throws ErrorMessage;

    @WebMethod(action = "urn:LogService/getEvents")
    @WebResult(name = "GetEventsResponse", targetNamespace = "http://logservice.services.bcldb.com", partName = "return")
    GetEventsResponse getEvents(
            @WebParam(name = "GetEventsRequest", targetNamespace = "http://logservice.services.bcldb.com", partName = "part") GetEventsRequest var1)
            throws ErrorMessage;

    @WebMethod(action = "urn:LogService/getEventsByStatus")
    @WebResult(name = "GetEventByStatusResponse", targetNamespace = "http://logservice.services.bcldb.com", partName = "return")
    GetEventByStatusResponse getEventsByStatus(
            @WebParam(name = "GetEventByStatusRequest", targetNamespace = "http://logservice.services.bcldb.com", partName = "part") GetEventByStatusRequest var1)
            throws ErrorMessage;

    @WebMethod(action = "urn:LogService/getNotificationInfo")
    @WebResult(name = "GetNotificationInfoResponse", targetNamespace = "http://logservice.services.bcldb.com", partName = "return")
    GetNotificationInfoResponse getNotificationInfo(
            @WebParam(name = "GetNotificationInfoRequest", targetNamespace = "http://logservice.services.bcldb.com", partName = "part") GetNotificationInfoRequest var1)
            throws ErrorMessage;

    @WebMethod(action = "urn:LogService/getFilteredEvents")
    @WebResult(name = "GetEventsResponse", targetNamespace = "http://logservice.services.bcldb.com", partName = "return")
    GetEventsResponse getFilteredEvents(
            @WebParam(name = "GetFilteredEventsRequest", targetNamespace = "http://logservice.services.bcldb.com", partName = "part") GetFilteredEventsRequest var1)
            throws ErrorMessage;

    @WebMethod(action = "urn:LogService/getListOfValues")
    @WebResult(name = "GetListOfValuesResponse", targetNamespace = "http://logservice.services.bcldb.com", partName = "return")
    GetListOfValuesResponse getListOfValues(
            @WebParam(name = "GetListOfValuesRequest", targetNamespace = "http://logservice.services.bcldb.com", partName = "part") GetListOfValuesRequest var1)
            throws ErrorMessage;

    @WebMethod(action = "urn:LogService/getStatistics")
    @WebResult(name = "GetStatisticsResponse", targetNamespace = "http://logservice.services.bcldb.com", partName = "return")
    GetStatisticsResponse getStatistics(
            @WebParam(name = "GetStatisticsRequest", targetNamespace = "http://logservice.services.bcldb.com", partName = "part") GetStatisticsRequest var1)
            throws ErrorMessage;
}
