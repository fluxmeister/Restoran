
<html>
<h1>Restoran Java app</h1>

Let’s see how we can implement builder design pattern in java.
<ol>
<li>First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.</li>
<li>Java Builder class should have a public constructor with all the required attributes as parameters.</li>
<li>Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.</li>
<li>The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument.</li>
</ol>
Builder pattern eplained in detail <a href="https://www.journaldev.com/1425/builder-design-pattern-in-java" target="_blank">here</a>.
</html>
