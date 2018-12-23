# Hibernate_PrimaryKeyGenerator

Primary Key Auto Generators:
Hibernate having two types of key generators
Assigned(default) - user is responsible for passing id’s
Increment - application will select max id from table, then increments that value
Sequence
Identity
Native
Foreign
Hilo
custom

By default <id> tag uses Assigned Generator. 
Ex:
<hibernate-mapping>
	<class name=”student” name=”student”>
		<id name=”id” column=”sid”>
		<generator class=”Assigned”/>
</id>
</class>
</hibernate-mapping>

Increment - in this generator type, first it get the maximum id(only one time) from table then increment continuously for each record. Here in the application level id will generated

Identity: here DB(Database table) layer is responsible for generating the id values, it is same like increment except the incrementation done on database side not on java application level. This is only support for MySql and DB2. Oracle doesn’t have any inbuilt function to increment the value in database.

Sequence: here both database and applications are responsible for generating id’s. In sequence it creates actual table and also one hibernate_sequence table. The sequence table contains next value. And it starts with 1 increment by 1.
Application will fetch next value from sequence table, and it combined this value with object values and stores into table. Database will take care of sequence incrementation, application will take care of fetching value from sequence table and stores the value. Mysql and DB2 doesn’t support sequences
We can pass custom sequence table information between generator tags

Hilo: it will create one Hibernate hilo table. This table having next high values.  Initially it starts with zero(while deploying). If you again restart the value starts from 32767, again if you restart the gain it increment value by 32767.

Native: internally it will follow increment, identity, sequence only, it doesn’t have any special technique.

Custom generator: to create custom generator , create custom generatot class which extends IdentityGenerator, override generate method, using that method create connection and run query for to get the next sequence number, and customize that value(using string concatenation), return that value. 




