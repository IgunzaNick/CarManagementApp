$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(vehiclemake,status){
$('#descriptionedit').val(vehiclemake.description);
$('#addstateedit').val(vehiclemake.id);
$('#detailsedit').val(vehiclemake.details);


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