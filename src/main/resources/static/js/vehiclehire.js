$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(VehicleHire,status){
$('#VehicleHireedit').val(VehicleHire.id);
$('#dateoutedit').val(VehicleHire.dateOut);
$('#dateinedit').val(VehicleHire.dateIn);



});
$('#editModal').modal();
});

$('table #deleteButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$('#confirmdelete').attr('href',href);
$('#deleteModal').modal();

});

});