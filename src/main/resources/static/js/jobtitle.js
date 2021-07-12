$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(jobtitle,status){
$('#descriptionedit').val(jobtitle.description);
$('#addstateedit').val(jobtitle.id);
$('#detailsedit').val(jobtitle.details);


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