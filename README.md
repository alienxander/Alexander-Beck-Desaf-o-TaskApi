**PREREQUISITOS MINIMOS**

- JDK o JRE 11 configurado correctamente con la variable JAVA\_HOME y path
- Node 14.17.0

**EJECUCION**

1.- Abrir una consola cmd, git bash u otra que aplique e ir al directorio del proyecto schedulator y ejecutar el siguiente comando. El proyecto se iniciará en el puerto 8080

![](/readmeImgs/1.png)

2.- Abrir una consola cmd, git bash u otra que aplique e ir al directorio del proyecto TaskApi y ejecutar el siguiente comando. El proyecto se iniciará en el puerto 8001

![](/readmeImgs/2.png)

3.- Abrir una consola cmd, git bash u otra que aplique e ir al directorio del proyecto task-front y ejecutar el siguiente comando. El proyecto se iniciará en el puerto 3000

**NOTA: Debe iniciar en el puerto 3000 ya que este está configurado para pasar el filtro de seguridad cors origin.**

![](/readmeImgs/3.png)

4.- Probar el micro servicio del schedulator. Colocar en un navegador web la siguiente url

[http://localhost:8080/generator/schedule/tasks](http://localhost:8080/generator/schedule/tasks)

![](/readmeImgs/4.png)

5.- Probar la API REST tasksPerWorkingDay. Colocar en un navegador web la siguiente url

[http://localhost:8001/task/tasksPerWorkingDay](http://localhost:8001/task/tasksPerWorkingDay)

![](/readmeImgs/5.png)

6.- Probar la aplicación REACT (FRONT) para ver el resultado en una vista gráfica. Colocar en un navegador web la siguiente url.

[http://localhost:3000/](http://localhost:3000/)

![](/readmeImgs/6.png)

7.- Presionar el botón ![](/readmeImgs/7.png) para volver a cargar los datos

8.- Para revisar la documentación de la API Rest tasksPerWorkingDay ir a la siguiente url:

[http://localhost:8001/swagger-ui.html](http://localhost:8001/swagger-ui.html)

9.- Para revisar la documentación java ir a la carpeta doc del proyecto TaskApi y hacer doble click en index.html

![](/readmeImgs/8.png)

![](/readmeImgs/9.png)

10.- Ejecutar test unitarios: Abrir una consola Windows cmd, git bash u otra que aplique y ejecutar el siguiente comando:

![](/readmeImgs/10.png)

- Se ejecutaran todos los test unitarios ya programados

![](/readmeImgs/11.png)

En total, los test son los siguientes:

apiRestBodyNotNull

apiRestMessageNotNull

apiRestMessageListExist

apiRestMessageResponse200

- Los test deben finalizar con un BUILD SUCCESSFUL

![](/readmeImgs/12.png)
