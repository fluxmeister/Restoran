
<html>
<h1>Restoran Java app</h1>

Let’s see how we can implement builder design pattern in java.
<ol>
<li>First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.</li>
<li>Java Builder class should have a public constructor with all the required attributes as parameters.</li>
<li>Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.</li>
<li>The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument.</li>
</ol>
Builder pattern explained in details <a href="https://www.journaldev.com/1425/builder-design-pattern-in-java" target="_blank">here</a>.
</html>


<i>Simulirati rad ovog sistema na sledeći način:</i>
1) Kreirati 4 stola numerisana brojevima od 1 do 4.
2) Kreirati 4 različite pizze, 5 pasti, 3 različita pića i 5 priloga. (imena generisati).
3) Kreirati tri porudžbine za prethodno kreirane stavke (ugledati se ili iskoristiti primer
ispod):
a) Sto broj 1
i) Pizza Capricciosa + kecap + origano,
ii) Pasta Italiana + extra cheese,
iii) 2 x Coca cola 0.5,
b) Sto broj 2
i) Pizza Siciliana,
ii) Pasta Carbonara,
iii) negazirani sok 0.25
c) Sto broj 3
i) 3 x Pizza Capricciosa + 2x kecap
ii) Gazirani sok 0.3, negazirani sok 0.5, čaša vode
4) Naplatiti prvu i treću porudžbinu.
5) Pokušati poručivanje Pizza Capricciosa za sto broj 2 (očekuje se da se baci izuzetak).
6) Naplatiti drugu porudžbinu
7) Pokušati poručivanje Pizza Capricciosa za sto broj 2 (očekuje se uspešno kreiranje
porudžbine bez izuzetka).
