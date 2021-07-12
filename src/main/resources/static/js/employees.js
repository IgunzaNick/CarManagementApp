$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(Employee,status){
$('#employeesidedit').val(Employee.id);
$('#usernameedit').val(Employee.username);
$('#phoneedit').val(Employee.phone);



});
$('#editModal').modal();
});

$('table #deleteButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$('#confirmdelete').attr('href',href);
$('#deleteModal').modal();

});
$('.table #photoButton').on('click',function(event) {
   event.preventDefault();
   var href = $(this).attr('href');
   $('#photoModal #employeePhoto').attr('src', href);
   $('#photoModal').modal();		
});

});