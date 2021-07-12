$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(vehiclestatus,status){
$('#descriptionedit').val(vehiclestatus.description);
$('#addstateedit').val(vehiclestatus.id);
$('#detailsedit').val(vehiclestatus.details);


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