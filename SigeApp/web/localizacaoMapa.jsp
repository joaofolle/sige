<%-- 
    Document   : localizacaoMapa
    Created on : 05/06/2016, 17:03:03
    Author     : Igor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Local do Evento</title>
            <meta name="viewport" content="initial-scale=1.0, user-scalable=no">    
            <style type="text/css">
                html, body {
                    height: 100%;
                    margin: 0;
                    padding: 0;
                }
                #map {
                    height: 100%;
                }
                #floating-panel {
                    position: fixed;
                    top: -150px;
                    left: 25%;
                    z-index: 5;                   
                }
                .btn-voltar{
                    font-family: 'Roboto','sans-serif';
                    position: absolute;
                    width: 60px;
                    left: calc(50% - 30px);
                    top: 10px;
                    z-index: 9999;                    
                    text-align:center;
                    color: gray;
                    text-decoration: none;
                    border: 2px solid gray;
                    border-radius: 10px;
                    padding: 10px
                }
                .btn-voltar:hover{
                    background: #ffffff;
                }
            </style>
        </head>
        <body >
            <div id="floating-panel">
                
                <h:inputText id="address"  value="otto niemeyer, porto alegre"/> 
                <h:inputText value="#{EventoBean.evento.lugar}"/>
            </div>
            <a class="btn-voltar" href="javascript:window.history.go(-1)">VOLTAR</a>
            <div id="map"></div>
            <script type="text/javascript">
                function initMap() {
                    var map = new google.maps.Map(document.getElementById('map'), {
                        zoom: 16,
                        center: {lat: -30.093703, lng: -51.141438}//-30.093703,-51.141438,porto alegre
                    });
                    var geocoder = new google.maps.Geocoder();


                    geocodeAddress(geocoder, map);//executa a função

                }

                function geocodeAddress(geocoder, resultsMap) {
                    var address = document.getElementById('address').value;
                    geocoder.geocode({'address': address}, function (results, status) {
                        if (status === google.maps.GeocoderStatus.OK) {
                            resultsMap.setCenter(results[0].geometry.location);
                            var marker = new google.maps.Marker({
                                map: resultsMap,
                                position: results[0].geometry.location
                            });
                        } else {
                            alert('Endereço não informado ' + status);
                        }
                    });
                }

            </script>
            <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAWMM38dR6Rg50ts6aDNXUaDFZpEI1G1As&signed_in=true&callback=initMap"
            async="true" defer="true"></script>
        </body>
          
    </html>
</f:view>
    