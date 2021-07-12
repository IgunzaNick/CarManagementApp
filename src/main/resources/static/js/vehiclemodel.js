$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(vehiclemodel,status){
$('#descriptionedit').val(vehiclemodel.description);
$('#addstateedit').val(vehiclemodel.id);
$('#detailsedit').val(vehiclemodel.details);


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