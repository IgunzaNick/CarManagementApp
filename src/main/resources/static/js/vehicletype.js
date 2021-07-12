$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(vehicletype,status){
$('#descriptionedit').val(vehicletype.description);
$('#addstateedit').val(vehicletype.id);
$('#detailsedit').val(vehicletype.details);


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