<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index JEE</title>
</head>
<body>
<h1>Bonjour index.jsp</h1>
<%! int variableTest = 0;%>
<% System.out.println("Bonjour Jee"); %>
<% for (int i=0; i < 9; i++){
		variableTest += 1;
		System.out.println(variableTest);
	}%>
<% if (variableTest >= 10) {
		System.out.println("variableTest >= 10");
	}else {
		System.out.println("variableTest < 10");
	}
	%>
<%!	int nombre1 = (int) Math.round(Math.random()*100); 
	int nombre2 = (int) Math.round(Math.random()*100);	
	
	int max(int a,int b){
		 
		if (a > b){
			 return a;
		}else {
			 return b;
		}		
	}%>
	
<% System.out.println(Math.random()*100); %>
<% System.out.println(max(nombre1,nombre2)); %>

<%= "chiffre aléatoire : " %>
<%= Math.round(Math.random()*100) %>
<%= "a = "  %>
<%= nombre1 %>
<%= "b = "  %>
<%= nombre2 %>
<%= "max =" %>
<%= max(nombre1,nombre2) %>

<% for (int j =0;j <10;j++){
	%>	
		<h1>Titre HTML</h1> 		
	<%
	}%>

<table style="border:solid red 1px">
	<% int chiffre = 1; 
	for (int ligne = 0 ; ligne < 3 ; ligne++) {
		%><tr ><%
		for (int colonne = 0 ; colonne <3 ; colonne++){
			%><td style="border:solid red 1px"><%= chiffre %></td><%
			chiffre++;	
		}
		%></tr><%
	}%>
</table>




</body>
</html>