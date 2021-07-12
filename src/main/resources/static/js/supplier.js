$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(supplier,status){
$('#supplieridedit').val(supplier.id);
$('#nameedit').val(supplier.name);
$('#websiteedit').val(supplier.website);
$('#emailedit').val(supplier.email);
$('#phoneedit').val(supplier.phone);


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