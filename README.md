# CVDS_LAB03
## Clases de Equivalencia
#### Integrantes:
- Santiago Naranjo Melo
- Gabriel Alejandro Silva Lozada

## *CREAR UN PROYECTO CON MAVEN* 

En el directorio de trabajo ejecutar el comando necesario para crear un proyecto maven, basado en un arquetipo:
* Grupo: edu.eci.cvds
* Artefacto: ClasesEquivalencia
* Paquete: edu.eci.cvds.tdd
* archetypeArtifactId: maven-archetype-quickstart

```
    mvn archetype:generate -Dfilter=maven-archetype-quickstart 
```

#1

## *Actualizar y crear dependencias en el proyecto*
- Busque en internet el repositorio central de maven. 
- Busque el artefacto JUnit y entre a la versión más nueva 
- Ingrese a la pestaña de Maven y haga click en el texto de la dependencia para copiarlo al portapapeles. 
- Edite el archivo pom.xml y realice las siguientes actualizaciones: 
  - Agregue la dependencia copiada a la sección de dependencias. 
  - Hay que cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:
``` 
   <properties>        
    <maven.compiler.target>1.8</maven.compiler.target>                   
    <maven.compiler.source>1.8</maven.compiler.source>     
    </properties> 
```
#2

## COMPILAR Y EJECUTAR
* Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo
pom no generan inconvenientes.
#3
* Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la clase
AppTest con resultado exitoso.
#4


## EJERCICIO “REGISTRADURÍA”
Se va a crear un proyecto base para un requerimiento de la registraduría en el cual se registrarán personas con intención de votar paras las próximas
elecciones y se generarán los certificados electorales de aquellas personas cuyo voto sea válido.

### PROPIEDADES
* Solo se registrarán votantes válidos
* Solo se permite una inscripción por número de documento
## EJECUTAR LAS PRUEBAS
Para correr las pruebas utilice
```
mvn package
```
![5](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/im5.PNG)
Tambien puede utilizar:
```
mvn test
```
#4.1
Revise cual es la diferencia.

## FINALIZAR EL EJERCICIO
* Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones. Deben ser al menos 5.
* Complete la implementación de la clase RegistryTest.java con (al menos) un método por cada clase de equivalencia, creando
diferentes personas y validando que el resultado sea el esperado.
    -Inicialmente se crean las pruebas y estas estaran en rojo puesto que aun no se ha diseñado e implementado la logica.
    
    #5
    #6
* Complete la implementación del método registerVoter en la clase Registry.java para retornar el resultado esperado según la entrada.

```
public RegisterResult registerVoter(Person p) {
        int id= p.getId();
        RegisterResult registerResult = RegisterResult.VALID;
        boolean vida= p.isAlive();
        int edad = p.getAge();


        if(votantes.containsKey(id)){
            registerResult = RegisterResult.DUPLICATED;
        } else if (!vida) {
            registerResult = RegisterResult.DEAD;
        } else if (edad <= 0) {
            registerResult = RegisterResult.INVALID_AGE;
        } else if (edad < 18) {
            registerResult  = RegisterResult.UNDERAGE;
        } else{
            votantes.put(id,p);
        }
        return registerResult;
    }
```
#7
#8
