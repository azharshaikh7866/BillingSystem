<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="common/header.jsp"></jsp:include>
<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Invoice
        <small>with GST</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="/home"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active"><a href="/addBill">Create Invoice</a></li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Create Invoice</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
             	<form role="form">
	            	<div class="form-group col-md-2">
	                  <label>Category</label>
	                  <select class="form-control category">
	                  	<option value="">Select Category</option>
	                  	<c:forEach items="${categoryList }" var="category">
	                  	<option value="${category.id}">${category.name}</option>
	                  	</c:forEach>
	                  </select>
	                </div>
	                <div class="form-group col-md-2">
	                  <label>Product</label>
	                  <select class="form-control product">
	                    <option>option 1</option>
	                    <option>option 2</option>
	                    <option>option 3</option>
	                    <option>option 4</option>
	                    <option>option 5</option>
	                  </select>
	                </div>
	                <div class="form-group col-md-2">
	                  <label>Select</label>
	                  <select class="form-control">
	                    <option>option 1</option>
	                    <option>option 2</option>
	                    <option>option 3</option>
	                    <option>option 4</option>
	                    <option>option 5</option>
	                  </select>
	                </div>
	                 <div class="form-group col-md-2">
	                  <label>Select</label>
	                  <select class="form-control">
	                    <option>option 1</option>
	                    <option>option 2</option>
	                    <option>option 3</option>
	                    <option>option 4</option>
	                    <option>option 5</option>
	                  </select>
	                </div>
	                 <div class="form-group col-md-2">
	                  <label>Select</label>
	                  <select class="form-control">
	                    <option>option 1</option>
	                    <option>option 2</option>
	                    <option>option 3</option>
	                    <option>option 4</option>
	                    <option>option 5</option>
	                  </select>
	                </div>
	                 <div class="form-group col-md-2">
	                  <label>Select</label>
	                  <select class="form-control">
	                    <option>option 1</option>
	                    <option>option 2</option>
	                    <option>option 3</option>
	                    <option>option 4</option>
	                    <option>option 5</option>
	                  </select>
	                </div>
                </form>
            </div>
            <div class="box-footer">
                <button type="submit" class="btn btn-info pull-right">Add more</button>
             </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

<jsp:include page="common/footer.jsp"></jsp:include>
<script type="text/javascript">
$(".category").change(function(){
	var catId=$(this).val();
		$.get("/getProductsByCategory", 
	{
			categoryId: catId
    },
    function(data, status){
	    	alert("Data: " + data + "\nStatus: " + status);
	});
	
});

</script>