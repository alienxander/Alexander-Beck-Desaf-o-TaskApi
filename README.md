**PREREQUISITOS MINIMOS**

- JDK o JRE 11 configurado correctamente con la variable JAVA\_HOME y path
- Node 14.17.0

**EJECUCION**

1.- Abrir una consola cmd, git bash u otra que aplique e ir al directorio del proyecto schedulator y ejecutar el siguiente comando. El proyecto se iniciará en el puerto 8080

!https://github.com/alienxander/Alexander-Beck-Desaf-o-TaskApi/blob/master/readmeImgs/1.png

2.- Abrir una consola cmd, git bash u otra que aplique e ir al directorio del proyecto TaskApi y ejecutar el siguiente comando. El proyecto se iniciará en el puerto 8001

![]/readmeImgs/.png)

3.- Abrir una consola cmd, git bash u otra que aplique e ir al directorio del proyecto task-front y ejecutar el siguiente comando. El proyecto se iniciará en el puerto 3000

**NOTA: Debe iniciar en el puerto 3000 ya que este está configurado para pasar el filtro de seguridad cors origin.**

![](RackMultipart20210529-4-zf52m1_html_85bb718aa49ca701.png)

4.- Probar el micro servicio del schedulator. Colocar en un navegador web la siguiente url

[http://localhost:8080/generator/schedule/tasks](http://localhost:8080/generator/schedule/tasks)

![](RackMultipart20210529-4-zf52m1_html_5bcc86404845f0d9.png)

5.- Probar la API REST tasksPerWorkingDay. Colocar en un navegador web la siguiente url

[http://localhost:8001/task/tasksPerWorkingDay](http://localhost:8001/task/tasksPerWorkingDay)

![](RackMultipart20210529-4-zf52m1_html_566a1a3437f820a.png)

6.- Probar la aplicación REACT (FRONT) para ver el resultado en una vista gráfica. Colocar en un navegador web la siguiente url.

[http://localhost:3000/](http://localhost:3000/)

![](RackMultipart20210529-4-zf52m1_html_b9131e37a1cf807.png)

7.- Presionar el botón ![](RackMultipart20210529-4-zf52m1_html_ae0606980a33946f.png) para volver a cargar los datos

8.- Para revisar la documentación de la API Rest tasksPerWorkingDay ir a la siguiente url:

[http://localhost:8001/swagger-ui.html](http://localhost:8001/swagger-ui.html)

9.- Para revisar la documentación java ir a la carpeta doc del proyecto TaskApi y hacer doble click en index.html

![](RackMultipart20210529-4-zf52m1_html_e8ba490839f9fc34.png)

![](RackMultipart20210529-4-zf52m1_html_3d4c1d7b7013bcee.png)

10.- Ejecutar test unitarios: Abrir una consola Windows cmd, git bash u otra que aplique y ejecutar el siguiente comando:

![](RackMultipart20210529-4-zf52m1_html_95a6cce544b74f01.png)

- Se ejecutaran todos los test unitarios ya programados

![](RackMultipart20210529-4-zf52m1_html_3bff80ecd5d11535.gif) ![](RackMultipart20210529-4-zf52m1_html_3bff80ecd5d11535.gif) ![](RackMultipart20210529-4-zf52m1_html_3bff80ecd5d11535.gif) ![](RackMultipart20210529-4-zf52m1_html_9c45eff6c9fb80f0.png)

En total, los test son los siguientes:

apiRestBodyNotNull

apiRestMessageNotNull

apiRestMessageListExist

apiRestMessageResponse200

- Los test deben finalizar con un BUILD SUCCESSFUL

![](RackMultipart20210529-4-zf52m1_html_f15d8f1dc6e3283d.png)
