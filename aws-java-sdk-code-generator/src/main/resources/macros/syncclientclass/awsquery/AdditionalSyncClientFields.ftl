<#macro content serviceModelRoot>
   /**
    * Map of exception unmarshallers for all modeled exceptions
    */
    private final Map<String, Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallersMap
            = new HashMap<String, Unmarshaller<AmazonServiceException, Node>>();

    /**
    * List of exception unmarshallers for all modeled exceptions
    * Even though this exceptionUnmarshallers is not used in Clients,  this is not removed since this was
    * directly used by Client extended classes. Using this list can cause performance impact.
    */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
    = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    protected Unmarshaller<AmazonServiceException, Node> defaultUnmarshaller;


    <#if AdditionalServiceSyncClientFieldsMacro?has_content>
        <@AdditionalServiceSyncClientFieldsMacro.content .data_model />
    </#if>
</#macro>
