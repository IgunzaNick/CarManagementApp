$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(contact,status){
$('#contactidedit').val(contact.id);
$('#nameedit').val(contact.firstname);
$('#emailedit').val(contact.email);
$('#phoneedit').val(contact.phone);



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