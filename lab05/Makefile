make: gramatica compilar ejecutar

gramatica:	scanner/Lab05Scanner.g
	java org.antlr.Tool ../../laboratorios/lab05/scanner/Lab05Scanner.g
	mv Lab05Scanner.tokens scanner

compilar:	scanner/Lab05Scanner.java
	javac ../../laboratorios/lab05/scanner/Lab05Scanner.java

ejecutar:
	javac ../../laboratorios/lab05/Lab05.java

clean:
	rm scanner/Lab05Scanner.tokens
	rm scanner/*.class
	rm scanner/Lab05Scanner.java
	clear