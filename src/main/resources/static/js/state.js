$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(state,status){
$('#stateidedit').val(state.id);
$('#codeedit').val(state.code);
$('#capitaledit').val(state.capital);
$('#nameedit').val(state.name);
$('#addcountryedit').val(state.countryid);
$('#detailsedit').val(state.details);


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