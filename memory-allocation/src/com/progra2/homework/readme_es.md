
# Implementando una lista: Resolviendo el problema
Un ejemplo de cómo resolver un problema desde la perspectiva del desarrollador abordando la solución desde la entrada/salida hasta el resultado final enumerando todos los escenarios posibles para desarrollar el código.

---

## Agenda
* Definición del Problema
* Priorización de tareas
* Definición de escenarios
* Implementación

---

## Definición del Problema(Requisitos)
Estructura:
* Mantener una lista infinita de enteros.
* Mantener el orden de inserción: Si se agrega 1, luego 2: la lista debe contener [1,2]
* Identificar que numero esta "después de"  y cual está "antes de" un número dado.
* Listar todos los números contenidos en la lista.
* Remover un número desde la lista: Remover sólo los números que hagan par con el indicado, los nodos encontrados deben ser descartados por la lista.

___

## Definiendo tareas


Es importante analizar la información dada para dividir el problema en subtareas, podemos definir la lista de tareas en base a los requerimientos.

---

## Definiendo tareas

#### 1. Crear una clase: Un lugar para guardar la lista completa. Esto puede ser una clase. Usemos _List_ como nombre de la clase por ahora.

    * Input: Enteros procesados asyncrónicamente.
    * Output: Lista de enteros
 
#### 2. Añade: Un punto de entrada para poblar los elementos de la lista
 
     * Input: Un número entero.
     * Output: La lista contendrá el número dado al final de la lista.
     
---
 
## Definiendo tareas
 
#### 3. Quita: Un punto de entrada para eliminar elementos de la lista
 
     * Input: Un número entero.
     * Output: Lista sin el número dado.
 
#### 4. Siguiente De: Un punto de entrada para obtener el siguiente número de uno dado.
 
     * Input: Un número entero.
     * Output: El número después del indicado.
---
 
## Definiendo tareas
 
#### 5. Anterior de: Un punto de entrada para obtener el anterior número de uno dado.
 
     * Input: Un número entero.
     * Output: El número anterior al indicado.
  
#### 6. Listar valores: Dada una lista de numeros ordenados, generar una representación
 
     * Input: Números enteros.
     * Output: Representación en forma de lista.
 
---
 
### Usando Diagrama de Clases UML
 Con la información que tenemos hasta ahora, podemos crear un diagrama UML de clase básica. Sin atributos sólo acciones que definan las entradas y salidas.
 
 ![UML Diagram](https://drive.google.com/uc?export=view&id=1t7Rr0R9-KdGI4U8myKHKJA2SzzVA-LoZ)
 
---
 
 ### Definición de Prioridades
 1. Definir la estructura
 2. Agregar
 3. Quitar
 4. Siguiente de
 5. Anterior de
 6. Imprimir
 
---
 
 ### 1. Definir la estructura
 ````java
 interface List{ 
      void add(Integer value);
      void remove(Integer value);
      Integer nextOf(Integer value);
      Integer previousOf(Integer value);
      String print();
 }
 ````
 
---
 
 ### 1. Definir la estructura: Alternativas
 ![List Node Example](https://drive.google.com/uc?export=view&id=1WtZuIjemWR6OgTqlW5p0UpghY7ZAUD8u)
 
---
 
 ### 1. Definir la estructura: Alternativas
 ![List Node Example](https://drive.google.com/uc?export=view&id=1Xkm9VcsHZ95uMnk-GGPA6hHP-j4UZN9K)
 
---
 
 ### 1. Definir la estructura
 ![List Node Example](https://drive.google.com/uc?export=view&id=1KSg3w10dZCNSV2aIYXlcbAeOhSCU6G_e)
 
---
 ### 1. Definir la estructura
 
 ````java
 class Node{
     private Integer value;
     private Node next;
     private Node previous;
     Node(Integer value){this.value=value;}
     //Assuming sets and gets are generated
 }
 ````
 
---

 ![List Node Example](https://drive.google.com/uc?export=view&id=19gJowbyy1Oi3aNH62w1hF1J7x9xV7TIz)
 
---
 
 ### 2. Agregar
 Escenarios de prueba
 1. Agregando un número cuando la lista esta vacía.
 2. Agregando un número cuando la lista contiene números.
 3. Agregando un valor nulo.
 
---
 
 ### 2. Agregar: Agregando un número cuando la lista esta vacía
 ````java
 class ListImpl{
    private Node first;
     void add(Integer value){
         Node node = new Node(value);
         this.first=node;
     }
 }
 ````
 
---
 
 ### 2. Agregar: Agregando un número cuando la lista contiene números
 
 Redefiniendo el método para lograr los escenarios
 
 ````java
 class ListImpl{
    private Node first;
    private Node last;
     void add(Integer value){
         Node node = new Node(value);
         if(this.last==null){//first scenario
             this.first=node;
             this.last=node;
         }else{//second scenario
            node.setPrevious(this.last);
            this.last.setNext(node);
            this.last = node;
         }
     }
 }
 ````
 
---
 
 ### 2. Agregar: Agregando un valor nulo.
 
 Redefiniendo el método para lograr los escenarios
 
 ````java
 class ListImpl{
    private Node first;
    private Node last;
    void add(Integer value){
        if (value == null) return;//third scenario
        Node node = new Node(value);
        if (this.last == null) {//first scenario
            this.first = node;
            this.last = node;
        } else {//second scenario
            node.setPrevious(this.last);
            this.last.setNext(node);
            this.last = node;
        }
     }
 }
 ````
 
---
 
  Necesitamos cambiar el diagrama original
 
  ![List Node Example](https://drive.google.com/uc?export=view&id=1GV2_OcXiGignEFwMOZwXSqah6V9OXgVi)


---
 
 ### 3. Quitar
 Escenarios de Prueba
 1. Quitar un nodo en posición media.
 2. Quitar un nodo en la última posición.
 3. Quitar un nodo en la primera posición.
 4. Quitar un valor nulo.
 5. Quitar un valor que no contiene la lista.
 
---
 
 ### 3. Quitar: Quitar un nodo en posición media.
 ![UML Diagram](https://drive.google.com/uc?export=view&id=1Qmzh8slG4HlmwHwVhPHrmOeM7OC1nEoM)
 
---
 
 ### 3. Quitar: Quitar un nodo en posición media.
 
 ````java
 class ListImpl{
     Node first;
     void remove(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
                 current.getNext().setPrevious(current.getPrevious());//first scenario
                 current.getPrevious().setNext(current.getNext());
             }
            current=current.getNext();
         }
 
     }
 }
 ````
 
---
 
 ### 3. Quitar: Quitar un nodo en la última posición.
 ![UML Diagram](https://drive.google.com/uc?export=view&id=1z2F8VTJ-4XSSQZbGAft_-rvcwUs_1Aw9)
 
---
 
 ### 3. Quitar: Quitar un nodo en la última posición.
 
 ````java
 class ListImpl{
     Node first;
     void remove(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)) {
                 if(current.getNext()!=null && current.getPrevious()!=null){
                     current.getNext().setPrevious(current.getPrevious());//first scenario
                     current.getPrevious().setNext(current.getNext());
                 }else if(current.getNext()==null && current.getPrevious()!=null ){//second scenario
                     current.getPrevious().setNext(null);
             
                 }
             }
             current=current.getNext();
        }
 
     }
 }
 ````
 
---
 
 ### 3. Quitar: Quitar un nodo en la primera posición.
 ![UML Diagram](https://drive.google.com/uc?export=view&id=10JXD4HKF8MWCveilnk31t1khoHfv6hOj)
 
---
 
 ### 3. Quitar: Quitar un nodo en la primera posición.
 
 ````java
 class ListImpl{
     Node first;
     void remove(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)) {
                 if(current.getNext()!=null && current.getPrevious()!=null){
                     current.getNext().setPrevious(current.getPrevious());//first scenario
                     current.getPrevious().setNext(current.getNext());
                 }else if(current.getNext()==null && current.getPrevious()!=null ){//second scenario
                     current.getPrevious().setNext(null);
                 }else if(current.getNext()!=null && current.getPrevious()==null ){//second scenario
                     current.getNext().setPrevious(null);
                     first=current.getNext();//Move reference for first node
                 }
             }
             current=current.getNext();
        }
 
     }
 }
 ````
 
---
 
 ### 3. Quitar: Quitar un valor nulo.
 
 ````java
 class ListImpl{
     Node first;
     void remove(Integer value){
         if(value==null)return;//fourth scenario
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)) {
                 if(current.getNext()!=null && current.getPrevious()!=null){
                     current.getNext().setPrevious(current.getPrevious());//first scenario
                     current.getPrevious().setNext(current.getNext());
                 }else if(current.getNext()==null && current.getPrevious()!=null ){//second scenario
                     current.getPrevious().setNext(null);
                 }else if(current.getNext()!=null && current.getPrevious()==null ){//third scenario
                     current.getNext().setPrevious(null);
                     first=current.getNext();//Move reference for first node
                 }
             }
             current=current.getNext();
        }
 
     }
 }
 ````
 
---
 
 ### 3. Quitar: Quitar un valor que no contiene la lista.
 
 Redefiniendo la estructura para ajustar el escenario
 ````java
 class ListImpl{
     Node first;
     boolean remove(Integer value){
         if(value==null)return;//fourth scenario
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)) {
                 if(current.getNext()!=null && current.getPrevious()!=null){
                     current.getNext().setPrevious(current.getPrevious());//first scenario
                     current.getPrevious().setNext(current.getNext());
                 }else if(current.getNext()==null && current.getPrevious()!=null ){//second scenario
                     current.getPrevious().setNext(null);
                 }else if(current.getNext()!=null && current.getPrevious()==null ){//third scenario
                     current.getNext().setPrevious(null);
                     first=current.getNext();//Move reference for first node
                 }
                 return true;//fifth scenario
             }
             current=current.getNext();
        }
         return false;//fifth scenario
     }
 }
 ````
 
---
 
 ### 3. Quitar: Analizar código para implementar escenarios no contemplados
 
 Redefiniendo la estructura para ajustar el escenario
 ````java
 class ListImpl{
     Node first;
     Node last;
     boolean remove(Integer value){
         if(value==null)return false;//fourth scenario
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)) {
                 if(current.getNext()!=null && current.getPrevious()!=null){
                     current.getNext().setPrevious(current.getPrevious());//first scenario
                     current.getPrevious().setNext(current.getNext());
                 }else if(current.getNext()==null && current.getPrevious()!=null ){//second scenario
                     current.getPrevious().setNext(null);
                     last=current.getPrevious();//Move reference for first node
                 }else if(current.getNext()!=null && current.getPrevious()==null ){//third scenario
                     current.getNext().setPrevious(null);
                     first=current.getNext();//Move reference for first node
                 }else{//sixth scenario: list only have one node
                     first=null;
                     last=null;

                 }
                 return true;//fifth scenario
             }
            current=current.getNext();
         }
         return false;//fifth scenario
     }
 }
 ````
 
---
 
 ### 4. Siguiente de
 Escenarios de Prueba
 1. Obtener el siguiente de un nodo medio.
 2. Obtener el siguiente del primer nodo.
 3. Obtener el siguiente del último nodo.
 4. Obtener el siguiente de un nodo no existente.
 5. Obtener el siguiente de un valor nulo.
 
---
 
 ### 4. Siguiente de: Obtener el siguiente de un nodo medio.
 
 ````java
 class ListImpl{
     Node first;
     Integer nextOf(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
                 return current.getNext().getValue();//first scenario
             }
             current=current.getNext();
         }
     return null;
     }
 }
 ````
 
---
 
 ### 4. Siguiente de: Obtener el siguiente del primer nodo.
 
 ¿Necesitamos cambiar algo al segundo escenario?
 ````java
 class ListImpl{
     Node first;
     Integer nextOf(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
                 return current.getNext().getValue();//first and second scenario
             }
             current=current.getNext();
         }
     return null;
     }
 }
 ````
 
---
 
 ### 4. Siguiente de: Obtener el siguiente del último nodo.
 
 ````java
 class ListImpl{
     Node first;
     Integer nextOf(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
             //first, second  and third scenario
                 return current.getNext()!=null ? current.getNext().getValue() : null;
             }
             current=current.getNext();
         }
     return null;
     }
 }
 ````
---
 
 ### 4. Siguiente de: Obtener el siguiente de un nodo no existente.
 
 ````java
 class ListImpl{
     Node first;
     Integer nextOf(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
             //first, second  and third scenario
                 return current.getNext()!=null ? current.getNext().getValue() : null;
             }
             current=current.getNext();
         }
     return null;//Alternatively we can throw an exception to indicate value not exist into the list
     }
 }
 ````
 
---
 
 ### 4. Siguiente de: Obtener el siguiente de un valor nulo.
 
 ````java
 class ListImpl{
     Node first;
     Integer nextOf(Integer value){
         if(value==null) return null;//fifth scenario: 
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
             //first, second  and third scenario
                 return current.getNext()!=null ? current.getNext().getValue() : null;
             }
             current=current.getNext();
         }
     return null;//Alternatively we can throw an exception to indicate value not exist into the list
     }
 }
 ````
 
---
 
 ### 5. Anterior de
Escenarios de Prueba
1. Obtener el anterior de un nodo medio.
2. Obtener el anterior del primer nodo.
3. Obtener el anterior del último nodo.
4. Obtener el anterior de un nodo no existente.
5. Obtener el anterior de un valor nulo.
  
---
 
 ### 5. Anterior de: Obtener el anterior de un nodo medio.
 
 ````java
 class ListImpl{
     Node first;
     Integer previousOf(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
                 return current.getPrevious().getValue();//first scenario
             }
             current=current.getNext();
         }
     return null;
     }
 }
 ````
 
---
 
 ### 5. Anterior de:  Obtener el anterior del primer nodo.
 
 ¿Necesitamos cambiar algo al segundo escenario?
 ````java
 class ListImpl{
     Node first;
     Integer previousOf(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
                 return current.getPrevious()!=null ? current.getPrevious().getValue() : null;//first and second scenario
             }
             current=current.getNext();
         }
     return null;
     }
 }
 ````
---
 
 ### 5. Anterior de: Obtener el anterior del último nodo.
 
 ````java
 class ListImpl{
     Node first;
     Integer previousOf(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
             //first, second  and third scenario
                 return current.getPrevious()!=null ? current.getPrevious().getValue() : null;
             }
             current=current.getNext();
         }
     return null;
     }
 }
 ````
 
---
 
 ### 5. Anterior de: Obtener el anterior de un nodo no existente.
 
 ````java
 class ListImpl{
     Node first;
     Integer previousOf(Integer value){
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
             //first, second  and third scenario
                 return current.getPrevious()!=null ? current.getPrevious().getValue() : null;
             }
             current=current.getNext();
         }
     return null;//Alternatively we can throw an exception to indicate value not exist into the list
     }
 }
 ````
 
---
 
 ### 5. Anterior de: Obtener el anterior de un valor nulo.
 
 ````java
 class ListImpl{
     Node first;
     Integer previousOf(Integer value){
         if(value==null) return null;//fifth scenario 
         Node current=first;
         while(current!=null){
             if(current.getValue().equals(value)){
             //first, second  and third scenario
                 return current.getPrevious()!=null ? current.getPrevious().getValue() : null;
             }
             current=current.getNext();
         }
     return null;//Alternatively we can throw an exception to indicate value not exist into the list
     }
 }
 ````
 
---
 
 ### 6. Imprimir
 Escenarios de Prueba
 1. Construye una cadena cuando la lista tenga valores.
 2. Construye una cadena cuando la lista no tiene valores.
 
---
 
 ### 6. Imprimir: Construye una cadena cuando la lista tenga valores.
 
 ````java
 class ListImpl{
     Node first;
     String print(){
         Node current = first;
         String value = "";
         while (current != null) {
             value += current.getValue() +" ";//first scenario
             current = current.getNext();
         }
         return value;
     }
 }
 ````
 
---
 
 ### 6. Imprimir: Construye una cadena cuando la lista no tiene valores.
 
 ````java
 class ListImpl{
     Node node;
     String print(){
         if (first == null) return "";// second scenario
         Node current = first;
         String value = "";
         while (current != null) {
             value += current.getValue() +" ";//first scenario
             current = current.getNext();
         }
         return value;
     }
 }
 ````
 
---
 
 ### 6. Imprimir: Optimizando
 Podemos ajustar el código de acuerdo con la especificación del lenguaje
 ````java
 class ListImpl{
     Node node;
     String toString(){
         if (first == null) return "";// second scenario
         Node current = first;
         String value = "";
         while (current != null) {
             value += current.getValue() +" ";//first scenario
             current = current.getNext();
         }
         return value;
     }
 }
 ````
 
---

### Enlaces de interés

https://www.baeldung.com/java-test-driven-list

---
    