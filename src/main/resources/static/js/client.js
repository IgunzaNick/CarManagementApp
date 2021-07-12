$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(client,status){
$('#idedit').val(client.id);
$('#nameedit').val(client.name);
$('#websiteedit').val(client.website);
$('#emailedit').val(client.email);
$('#phoneedit').val(client.phone);


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