$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(Vehicle,status){
$('#vehicleidedit').val(Vehicle.id);
$('#vehiclenameedit').val(Vehicle.name);
$('#descriptionedit').val(Vehicle.description);
$('#acquisitiondateedit').val(Vehicle.acquisitionDate);
$('#vehicletypesedit').val(Vehicle.phone);


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