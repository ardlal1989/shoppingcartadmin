function updateStatus(newLocation){
	console.log("GetCall URL: " + newLocation);
	$.get(newLocation, function(data, status){
	  console.log("Data: " + data + "\nStatus: " + status);
	  location.reload(true);
	  //window.location = newLocation;
	});
}