<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<LINK href="styles/mainStyle.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sisselogimine</title>
</head>
<body>
<!-- Ajutiselt ainult redirectib järgmisele lehele, muidu peaks ka login funktsioon siin toimuma -->
<!-- kontrolleri tegemise kood Roo's: -->
<!-- web mvc controller --class ~.web.FeedingController -->
<!-- 
Vaated on nimetatud vastavalt piltidele ning asuvad WEB-INF/views kaustas vastavalt:
intsidendireg - intsidendi registreerimise vaade
intsidendiredaktor
intsidendipiirivalvurired - Intsidendiga seotud piirivalvuri detailide redaktor
intsidendidpiirivalvurikaupa - Intsidendid piirilõigul piirivalvuri kaupa
 -->
<form action='<jsp:forward page="incidentViews.jsp"></jsp:forward>' method="post">
<div><input type="text" name="username" /></div>
<div>Parool:<input type="password" name="password" /></div>
<div><input type="submit" /></div>
</form>
</body>
</html>