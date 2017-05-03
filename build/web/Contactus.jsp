<%-- 
    Document   : Contactus
    Created on : Apr 21, 2017, 2:07:44 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
<style>
#a1{
background-color:
#FF99CC;
color:
#3333CC;
border:medium thick #FF3399;
font-family:Georgia, "Times New Roman", Times, serif bold;


}
h1 {background-color:#CCCCCC;}
li {background-color:#CCCCCC; font-size:18px;
font-family:Georgia, "Times New Roman", Times, serif;
text-shadow:inherit;color:#3333CC;}
br {background-color:#CC6699;}

</style>
</head>

<body>
<h1><ul>CONTACT US</ul></h1>
<br />
<br> -------------READER---------------</br>
<li>Subscriptions</li>
<li>To subscribe or get information about your subscription to Interior Design, see Subscriber Services, call 647-573-4625, or e-mail dpatel705@icloud.com</li> 
<li>•Product Information


For more information on a product seen in Interior Design, fill out our Online Reader Service Card </li>
<br />
<br />

<script
src="http://maps.googleapis.com/maps/api/js">
</script>

<script>
var myCenter=new google.maps.LatLng(43.653226,-79.383184);

function initialize()
{
var mapProp = {
  center:myCenter,
  zoom:5,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };

var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

var marker=new google.maps.Marker({
  position:myCenter,
  animation:google.maps.Animation.BOUNCE
  });
  

marker.setMap(map);
}

google.maps.event.addDomListener(window, 'load', initialize);
</script>


<body>
<div id="googleMap" style="width:500px;height:380px;"></div>

</body>
</center>

    </body>
</head>
</html>
