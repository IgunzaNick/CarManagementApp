$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(vehiclemovement,status){
$('#vehiclemovementidedit').val(vehiclemovement.id);
$('#nameedit').val(vehiclemovement.name);
$('#startedit').val(vehiclemovement.startDate);
$('#remarksedit').val(vehiclemovement.remarks);


});
$('#editModal').modal();
});

/*$('table #deleteButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$('#confirmdelete').attr('href',href);
$('#deleteModal').modal();

});
*/

});