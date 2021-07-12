$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(invoicestatus,status){
$('#descriptionedit').val(invoicestatus.description);
$('#addstateedit').val(invoicestatus.id);
$('#detailsedit').val(invoicestatus.details);


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