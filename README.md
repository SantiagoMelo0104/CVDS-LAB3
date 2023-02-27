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

![1](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/im1.PNG)

## *Actualizar y crear dependencias en el proyecto*
- Busque en internet el repositorio central de maven. 
- Busque el artefacto JUnit y entre a la versión más nueva 
- Ingrese a la pestaña de Maven y haga click en el texto de la dependencia para copiarlo al portapapeles. 
- Edite el archivo pom.xml y realice las siguientes actualizaciones: 
  - Agregue la dependencia copiada a la sección de dependencias. 
  - Hay que cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:
 
   <properties>        
    <maven.compiler.target>1.8</maven.compiler.target>                   
    <maven.compiler.source>1.8</maven.compiler.source>     
    </properties> 

## COMPILAR Y EJECUTAR
* Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo
pom no generan inconvenientes.
![2](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/im2.PNG)
![3](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/im3.PNG)
* Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la clase
AppTest con resultado exitoso.
![4](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/im4.PNG)


## EJERCICIO “REGISTRADURÍA”
Se va a crear un proyecto base para un requerimiento de la registraduría en el cual se registrarán personas con intención de votar paras las próximas
elecciones y se generarán los certificados electorales de aquellas personas cuyo voto sea válido.

### PROPIEDADES
* Solo se registrarán votantes válidos
* Solo se permite una inscripción por número de documento
## EJECUTAR LAS PRUEBAS
Para correr las pruebas utilice

mvn package

![5](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/im5.PNG)
Tambien puede utilizar:

mvn test

![6](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/im6.PNG)
Revise cual es la diferencia.

## FINALIZAR EL EJERCICIO
* Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones. Deben ser al menos 5.
* Complete la implementación de la clase RegistryTest.java con (al menos) un método por cada clase de equivalencia, creando
diferentes personas y validando que el resultado sea el esperado.
* Complete la implementación del método registerVoter en la clase Registry.java para retornar el resultado esperado según la entrada.

![7](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/PRUEBAS1.PNG)
![8](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/EjPrueba1.PNG)
![9](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/ejrpuebamaven.PNG)
