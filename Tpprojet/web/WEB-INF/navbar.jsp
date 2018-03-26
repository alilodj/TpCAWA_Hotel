<%-- 
    Document   : navbar
    Created on : 21-Mar-2018, 22:23:11
    Author     : alilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<nav class="navbar-inverse">
    
    <div class="navbar-collapse collapse">
        <div class="navbar-header">
      <a class="navbar-brand" href="#">${ sessionScope.user }</a>
    </div>
    <ul class="nav navbar-nav navbar-left">
        <li><a href="/Tpprojet/acuille">Accuill</a></li>
    <li><a name="nav" href="/Tpprojet/AjouterCli">Ajouter Client</a></li>
    <li><a name="nav" href="/Tpprojet/AffiClis">Afficher Clients</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#about">Right</a></li>
      <li><a href="#contact">sinup</a></li>
    </ul>
  </div>
    
</nav>
