$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(location,status){
$('#locationidedit').val(location.locationid);
$('#cityedit').val(location.city);
$('#addressedit').val(location.address);
$('#descriptionedit').val(location.description);
$('#addcountryedit').val(location.countryid);
$('#addstateedit').val(location.id);
$('#detailsedit').val(location.details);


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