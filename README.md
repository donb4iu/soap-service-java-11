# soap-service-java-11
This project is created to fix the soap web service creation problems with java 11.
It uses the correct dependencies with correct versions to fix the following compile time error and SOAP Fault.

```plaintext
Caused by: java.lang.ClassNotFoundException: javax.activation.MimeTypeParseException
        at org.codehaus.plexus.classworlds.strategy.SelfFirstStrategy.loadClass(SelfFirstStrategy.java:50)
        at org.codehaus.plexus.classworlds.realm.ClassRealm.unsynchronizedLoadClass(ClassRealm.java:271)
        at org.codehaus.plexus.classworlds.realm.ClassRealm.loadClass(ClassRealm.java:247)
        at org.codehaus.plexus.classworlds.realm.ClassRealm.loadClass(ClassRealm.java:239)
        ... 54 more
 ```       
        
```xml
 <SOAP-ENV:Fault>
   <faultcode>SOAP-ENV:Server</faultcode>
   <faultstring xml:lang="en">Implementation of JAXB-API has not been found on module path or classpath.</faultstring>
</SOAP-ENV:Fault>
```
