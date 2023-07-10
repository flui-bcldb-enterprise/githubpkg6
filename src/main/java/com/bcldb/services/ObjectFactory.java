// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private static final QName _GetIDRequest_QNAME = new QName("http://logservice.services.bcldb.com", "GetIDRequest");
    private static final QName _ServiceError_QNAME = new QName("http://type.common.services.bcldb.com", "ServiceError");
    private static final QName _GetVersionInfoRequest_QNAME = new QName("http://common.services.bcldb.com",
            "GetVersionInfoRequest");
    private static final QName _ServicePostResponse_QNAME = new QName("http://type.common.services.bcldb.com",
            "servicePostResponse");
    private static final QName _IncidentTypeOptionalField1_QNAME = new QName("http://logservice.services.bcldb.com",
            "OptionalField1");
    private static final QName _IncidentTypeFaultName_QNAME = new QName("http://logservice.services.bcldb.com",
            "FaultName");
    private static final QName _IncidentTypeOptionalField5_QNAME = new QName("http://logservice.services.bcldb.com",
            "OptionalField5");
    private static final QName _IncidentTypeOptionalField4_QNAME = new QName("http://logservice.services.bcldb.com",
            "OptionalField4");
    private static final QName _IncidentTypeMessage_QNAME = new QName("http://logservice.services.bcldb.com",
            "Message");
    private static final QName _IncidentTypeOptionalField3_QNAME = new QName("http://logservice.services.bcldb.com",
            "OptionalField3");
    private static final QName _IncidentTypeOptionalField2_QNAME = new QName("http://logservice.services.bcldb.com",
            "OptionalField2");
    private static final QName _IncidentTypeBusinessProcessStep_QNAME = new QName(
            "http://logservice.services.bcldb.com", "BusinessProcessStep");
    private static final QName _ProcessTypeMessagePayLoad_QNAME = new QName("http://logservice.services.bcldb.com",
            "MessagePayLoad");
    private static final QName _ProcessTypeTargetSystemName_QNAME = new QName("http://logservice.services.bcldb.com",
            "TargetSystemName");
    private static final QName _ProcessTypeSourceSystemName_QNAME = new QName("http://logservice.services.bcldb.com",
            "SourceSystemName");
    private static final QName _ProcessTypeInstanceID_QNAME = new QName("http://logservice.services.bcldb.com",
            "InstanceID");
    private static final QName _ProcessTypeDomainName_QNAME = new QName("http://logservice.services.bcldb.com",
            "DomainName");
    private static final QName _ProcessTypeStatus_QNAME = new QName("http://logservice.services.bcldb.com", "Status");

    public ObjectFactory() {
    }

    public ServiceErrorType createServiceErrorType() {
        return new ServiceErrorType();
    }

    public PostServiceResponseType createPostServiceResponseType() {
        return new PostServiceResponseType();
    }

    public EmptyRequestType createEmptyRequestType() {
        return new EmptyRequestType();
    }

    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    public ContactType createContactType() {
        return new ContactType();
    }

    public MonetaryValueType createMonetaryValueType() {
        return new MonetaryValueType();
    }

    public DateRangeType createDateRangeType() {
        return new DateRangeType();
    }

    public GenericAddressType createGenericAddressType() {
        return new GenericAddressType();
    }

    public LastChangeDateTimeType createLastChangeDateTimeType() {
        return new LastChangeDateTimeType();
    }

    public LastChangeType createLastChangeType() {
        return new LastChangeType();
    }

    public MandatoryDateRangeType createMandatoryDateRangeType() {
        return new MandatoryDateRangeType();
    }

    public GetEventByStatusRequest createGetEventByStatusRequest() {
        return new GetEventByStatusRequest();
    }

    public GetStatisticsRequest createGetStatisticsRequest() {
        return new GetStatisticsRequest();
    }

    public PostEventRequest createPostEventRequest() {
        return new PostEventRequest();
    }

    public EventType createEventType() {
        return new EventType();
    }

    public GetEventsResponse createGetEventsResponse() {
        return new GetEventsResponse();
    }

    public GetFilteredEventsRequest createGetFilteredEventsRequest() {
        return new GetFilteredEventsRequest();
    }

    public GetIDResponse createGetIDResponse() {
        return new GetIDResponse();
    }

    public GetEventsRequest createGetEventsRequest() {
        return new GetEventsRequest();
    }

    public GetListOfValuesResponse createGetListOfValuesResponse() {
        return new GetListOfValuesResponse();
    }

    public ListOfValueType createListOfValueType() {
        return new ListOfValueType();
    }

    public GetEventByStatusResponse createGetEventByStatusResponse() {
        return new GetEventByStatusResponse();
    }

    public GetListOfValuesRequest createGetListOfValuesRequest() {
        return new GetListOfValuesRequest();
    }

    public GetStatisticsResponse createGetStatisticsResponse() {
        return new GetStatisticsResponse();
    }

    public EventStatisticsType createEventStatisticsType() {
        return new EventStatisticsType();
    }

    public GetNotificationInfoRequest createGetNotificationInfoRequest() {
        return new GetNotificationInfoRequest();
    }

    public GetNotificationInfoResponse createGetNotificationInfoResponse() {
        return new GetNotificationInfoResponse();
    }

    public IncidentType createIncidentType() {
        return new IncidentType();
    }

    public ListValueType createListValueType() {
        return new ListValueType();
    }

    public ProcessType createProcessType() {
        return new ProcessType();
    }

    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "GetIDRequest")
    public JAXBElement<EmptyRequestType> createGetIDRequest(EmptyRequestType value) {
        return new JAXBElement(_GetIDRequest_QNAME, EmptyRequestType.class, (Class) null, value);
    }

    @XmlElementDecl(namespace = "http://type.common.services.bcldb.com", name = "ServiceError")
    public JAXBElement<ServiceErrorType> createServiceError(ServiceErrorType value) {
        return new JAXBElement(_ServiceError_QNAME, ServiceErrorType.class, (Class) null, value);
    }

    @XmlElementDecl(namespace = "http://common.services.bcldb.com", name = "GetVersionInfoRequest")
    public JAXBElement<EmptyRequestType> createGetVersionInfoRequest(EmptyRequestType value) {
        return new JAXBElement(_GetVersionInfoRequest_QNAME, EmptyRequestType.class, (Class) null, value);
    }

    @XmlElementDecl(namespace = "http://type.common.services.bcldb.com", name = "servicePostResponse")
    public JAXBElement<PostServiceResponseType> createServicePostResponse(PostServiceResponseType value) {
        return new JAXBElement(_ServicePostResponse_QNAME, PostServiceResponseType.class, (Class) null, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "OptionalField1", scope = IncidentType.class)
    public JAXBElement<String> createIncidentTypeOptionalField1(String value) {
        return new JAXBElement(_IncidentTypeOptionalField1_QNAME, String.class, IncidentType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "FaultName", scope = IncidentType.class)
    public JAXBElement<String> createIncidentTypeFaultName(String value) {
        return new JAXBElement(_IncidentTypeFaultName_QNAME, String.class, IncidentType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "OptionalField5", scope = IncidentType.class)
    public JAXBElement<String> createIncidentTypeOptionalField5(String value) {
        return new JAXBElement(_IncidentTypeOptionalField5_QNAME, String.class, IncidentType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "OptionalField4", scope = IncidentType.class)
    public JAXBElement<String> createIncidentTypeOptionalField4(String value) {
        return new JAXBElement(_IncidentTypeOptionalField4_QNAME, String.class, IncidentType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "Message", scope = IncidentType.class)
    public JAXBElement<String> createIncidentTypeMessage(String value) {
        return new JAXBElement(_IncidentTypeMessage_QNAME, String.class, IncidentType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "OptionalField3", scope = IncidentType.class)
    public JAXBElement<String> createIncidentTypeOptionalField3(String value) {
        return new JAXBElement(_IncidentTypeOptionalField3_QNAME, String.class, IncidentType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "OptionalField2", scope = IncidentType.class)
    public JAXBElement<String> createIncidentTypeOptionalField2(String value) {
        return new JAXBElement(_IncidentTypeOptionalField2_QNAME, String.class, IncidentType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "BusinessProcessStep", scope = IncidentType.class)
    public JAXBElement<String> createIncidentTypeBusinessProcessStep(String value) {
        return new JAXBElement(_IncidentTypeBusinessProcessStep_QNAME, String.class, IncidentType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "MessagePayLoad", scope = ProcessType.class)
    public JAXBElement<String> createProcessTypeMessagePayLoad(String value) {
        return new JAXBElement(_ProcessTypeMessagePayLoad_QNAME, String.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "OptionalField1", scope = ProcessType.class)
    public JAXBElement<String> createProcessTypeOptionalField1(String value) {
        return new JAXBElement(_IncidentTypeOptionalField1_QNAME, String.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "TargetSystemName", scope = ProcessType.class, defaultValue = "0")
    public JAXBElement<String> createProcessTypeTargetSystemName(String value) {
        return new JAXBElement(_ProcessTypeTargetSystemName_QNAME, String.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "OptionalField5", scope = ProcessType.class)
    public JAXBElement<String> createProcessTypeOptionalField5(String value) {
        return new JAXBElement(_IncidentTypeOptionalField5_QNAME, String.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "SourceSystemName", scope = ProcessType.class)
    public JAXBElement<String> createProcessTypeSourceSystemName(String value) {
        return new JAXBElement(_ProcessTypeSourceSystemName_QNAME, String.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "OptionalField4", scope = ProcessType.class)
    public JAXBElement<String> createProcessTypeOptionalField4(String value) {
        return new JAXBElement(_IncidentTypeOptionalField4_QNAME, String.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "OptionalField3", scope = ProcessType.class)
    public JAXBElement<String> createProcessTypeOptionalField3(String value) {
        return new JAXBElement(_IncidentTypeOptionalField3_QNAME, String.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "InstanceID", scope = ProcessType.class)
    public JAXBElement<String> createProcessTypeInstanceID(String value) {
        return new JAXBElement(_ProcessTypeInstanceID_QNAME, String.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "DomainName", scope = ProcessType.class, defaultValue = "0")
    public JAXBElement<String> createProcessTypeDomainName(String value) {
        return new JAXBElement(_ProcessTypeDomainName_QNAME, String.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "OptionalField2", scope = ProcessType.class)
    public JAXBElement<String> createProcessTypeOptionalField2(String value) {
        return new JAXBElement(_IncidentTypeOptionalField2_QNAME, String.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "Status", scope = ProcessType.class)
    public JAXBElement<StatusEnumType> createProcessTypeStatus(StatusEnumType value) {
        return new JAXBElement(_ProcessTypeStatus_QNAME, StatusEnumType.class, ProcessType.class, value);
    }

    @XmlElementDecl(namespace = "http://logservice.services.bcldb.com", name = "InstanceID", scope = EventType.class)
    public JAXBElement<String> createEventTypeInstanceID(String value) {
        return new JAXBElement(_ProcessTypeInstanceID_QNAME, String.class, EventType.class, value);
    }
}
