#
# Step 1 - Add __H2__ , __Lombok__, and __Spring Data JPA__ dependencies
> Move dependency elements into correct location in pom.xml
#
# Step 2 - Configure application.properties file.          
### REQUIRED OPTIONS
* __spring.jpa.hibernate.ddl-auto=update__              \# *Update database schema when changes made to Entity classes* 
* __spring.h2.console.enabled=true__                    \# *Enable h2 console at localhost:8080/h2-console*
* __spring.datasource.url = jdbc:h2:mem:events__        \# *Set the name of the database*
### DEBUG OPTIONS
* __spring.jpa.show-sql=true__                          \# *Show generated SQL during project build*
* __spring.jpa.properties.hibernate.format_sql=true__   \# *Indented genreted SQL for easier reading*
* __logging.level.org.hibernate.SQL=DEBUG__             \# *Set the debug level for hibernate logs*

#
# TEST AND COMMIT
    * Test the configuration by running the application and opening the h2 console at  localhost:8080/h2-console 
    * Change the database name on the h2 login page to __jdbc:h2:mem:events__ and click __Connect__
    * On successfully testing this step, commit project files to the local repo.
#
# Step 3 - Annotate the Event class
*   Remove all getters and setters
*   Remove toString method 
*   This should leave only the field declarations.
*   Annotate the Event class witm
    * @Entity
    * @Data
    * @NoArgsConstructor
    * @ToString
*   Annotate the prikary key with
    * @Id
    * @GeneratedValue(strategy = GenerationType.AUTO)

#
# TEST AND COMMIT
    * Test the Event Entity class by building the project and opening the h2 console.
    * The EVENT Table should now exist in the database.
    * On successfully testing this step, commit project files to the local repo.
#
# Step 4 - Create Repository
*   Create a __repositories__ folder (same level as controllers, services, and model)
*   Create an __EventRepo__ interface  (i.e. EventRepo.java with __interface__ instead of __class__ )
*   Extend the interface with __ListCrudRepository<Event,Integer>__
*   Note: The type parameters identify Entity and primary key types.
#
# Step 4 - Create EventService 
*   Note: We do not need EventList any more.
*   Create EventService class.
*   Declare and Inject __EventRepo eventRepo__
*   Create __add(event)__ method that calls the __eventRepo.save(event)__
#
# Step 5 - Update InitService
*   Replace use of __EventList__ in __InitService__ with __EventService__

