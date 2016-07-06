

function initAutocomplete() {
  
  var input = document.getElementById('txtlocal');
  var searchBox = new google.maps.places.SearchBox(input);
  

  
  map.addListener('bounds_changed', function() {
    searchBox.setBounds(map.getBounds());
  });

  var markers = [];
  
  searchBox.addListener('places_changed', function() {
    var places = searchBox.getPlaces();

    if (places.length === 0) {
      return;
    }

    
    markers.forEach(function(marker) {
      marker.setMap(null);
    });
    markers = [];

    
//    var bounds = new google.maps.LatLngBounds();
//    places.forEach(function(place) {
////      
//      markers.push(new google.maps.Marker({
//        map: map,
//        icon: icon,
//        title: place.name,
//        position: place.geometry.location
//      }));
//
//      if (place.geometry.viewport) {
//        // Only geocodes have viewport.
//        bounds.union(place.geometry.viewport);
//      } else {
//        bounds.extend(place.geometry.location);
//      }
//    });
    //map.fitBounds(bounds);
  });
}




function loadScript(src, callback) {

    var script = document.createElement("script");
    script.type = "text/javascript";
    if (callback)
        script.onload = callback;
    document.getElementsByTagName("head")[0].appendChild(script);
    script.src = src;
}
loadScript('https://maps.googleapis.com/maps/api/js?key=AIzaSyCZiFconlkX4lv9MKcXQo-BkQX9-QY-L0w&libraries=places&callback=initAutocomplete',
        function () {
            //alert('carrego?');
        });