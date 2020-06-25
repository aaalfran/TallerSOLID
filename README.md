# Taller de Principios SOLID
## ¿Cómo se violan los principios SOLID?
1. Antes de realizar cambios, las clases Helado y Pastel se comportaban 
de manera distinta teniendo similitudes, cuando puede existir una clae 
Postre para que ambas puedan comportarse como su clase Padre. Esto viola 
el principio de sustitución de Liskov.  
2. En el literal 2 se viola el Open/Closed principle, ya que si quisiera 
agregar aderezos a otro tipo de postre, tendria que modificar el codigo 
de nuevo, es decir, crear metodos para ese nuevo tipo de postre.  
3. En el literal 3, se viola el principio de responsabilidad única 
debido a que los métodos de calcular precio y mostrar precio no están 
relacionados a las clases Pastel y Helado, por eso deberían ser métodos 
pero de otra clase que se encargue de estos.  
4. En el literal 4, se viola el Open/Closed principle, ya que en el caso 
de querer crear otro aderezo, tendría que modificar el codigo del enum. 
Cuando simplemente se podría extender de una clase padre Aderezo.  
5. En el literal 5, se viola el principio de sustitución de Liskov, 
porque inicialmente la clase hija de Leche Entera no podía comportarse 
como su clase padre sin presentar fallos en el sistema.  

