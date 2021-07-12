$('document').ready(function(){

$('table #editButton').on('click',function(event){
event.preventDefault();
var href = $(this).attr('href');
$.get(href,function(invoice,status){
$('#idedit').val(invoice.id);
$('#clientedit').val(invoice.invoiceDate);
var invoicedate = invoice.invoiceDate.substr(0,10);
$('#invoicedateedit').val(invoice.invoiceDate);
$('#remarksedit').val(invoice.remarks);


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