<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<title>Quản lý loại hàng</title>
</head>
<body>
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="<c:url value="/admin/products" />">Trang chủ</a> <span
					class="divider">/</span></li>
				<li class="active">Loại hàng</li>
			</ul>
			<div class="well well-small">

				<hr class="soften" />
				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Tên loại hàng</th>
							<th>Mô tả</th>
							<th>Thêm</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<form:form action="AddCategory" method="POST"
								modelAttribute="themloaihang">
								<td><form:input path="name" type="text"
										placeholder=" Nhập tên loại hàng" /></td>
								<td><form:input path="description" type="text"
										placeholder=" Nhập mô tả" /></td>
								<td><input type="submit" name="submitProduct"
									value="Thêm" class="exclusive"></td>
							</form:form>
						</tr>
					</tbody>
				</table>
				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Loại hàng</th>
							<th></th>
							<th>Mô tả</th>
							<th>Xóa</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach var="item" items="${ categorys }">
							<tr>
								<td><input type="text" id="name-${item.id}"
									value="${item.name}" /></td>
								<td><input type="text" id="description-${item.id}"
									value="${item.description}" /></td>
								<td><button data-id="${item.id}"
										class="btn btn-mini btn-danger edit-cart" type="button">
										<span class="icon-edit"></span>
									</button></td>
								<td><a
									href="<c:url value="/admin/DeleteCategory/${item.id}"/>"
									class="btn btn-mini btn-danger" type="button"> <span
										class="icon-remove"></span>
								</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<br />
			</div>
		</div>
	</div>
	<content tag="script"> <script>
		$(".edit-cart").on("click", function() {
			var id = $(this).data("id");
			var name = $("#name-" + id).val();
			var description = $("#description-" + id).val();
			window.location = "EditCategory/" + id + "/" + name + "/" + description;
		});
	</script></content>
</body>