function EnableDisableTextBox(checkbox_caAn, inputCaAn) {
    var input_ca1 = document.getElementById(inputCaAn);
    var checkbox_caAn = document.getElementById(checkbox_caAn)
    input_ca1.disabled = checkbox_caAn.checked ? false : true;
    if (!input_ca1.disabled) {
        input_ca1.focus();
    }
}
function ToJavaScriptDate(value) {
    var pattern = /Date(([^)]+))/;
    var results = pattern.exec(value);
    var tmp = results[1].replace('(', '');
    var dt = new Date(parseFloat(tmp));
    //console.log(dt);
    var ngay = dt.getDate().toString();
    var thang = (dt.getMonth() + 1).toString();
    //console.log(ngay.length);
    //console.log(thang.length);
    if (ngay.length < 2) {
        ngay = '0' + ngay;
    }
    if (thang.length < 2) {
        thang = '0' + thang;
    }
    return ngay + "/" + thang + "/" + dt.getFullYear();
};
function ToJavaScriptDateInput(value) {
    var pattern = /Date(([^)]+))/;
    var results = pattern.exec(value);
    var tmp = results[1].replace('(', '');
    var dt = new Date(parseFloat(tmp));
    //console.log(dt);
    var ngay = dt.getDate().toString();
    var thang = (dt.getMonth() + 1).toString();
    //console.log(ngay.length);
    //console.log(thang.length);
    if (ngay.length < 2) {
        ngay = '0' + ngay;
    }
    if (thang.length < 2) {
        thang = '0' + thang;
    }
    return dt.getFullYear() + "-" + thang + "-" + ngay;
};
function formatSex(value) {
    if (value == true) {
        return "Nam";
    }
    return "Nữ";
};

$('#showDkiCaNhan').click(function () {
    debugger;

    $.ajax({
        url: "/CaAn/getFormDkiCN",
        type: 'GET',
        data: {
            thongBao: ""
        },
        success: function (model) {
            $('#searchBox').hide();
            $('body').removeClass("show-sidebar");
            $('#btnCloseSidebar').removeClass("active");
            var result =
                '<div class="card" id="phieuDKCN">' +
                '<h5 class="text-center mb-4">phiếu đăng ký ăn cá nhân</h5>' +
                '<form id="formdkicanhan">' +
                '<div class="form-group">' +
                '<label for="exampleInputEmail1">Họ tên</label>' +
                '<input type="hidden" id="DCCNIDpb"value="' + model.IDPhongBan + '">' +
                '<input type="hidden" id="DKCNID_NDK" value="' + model.ID_NDK + '">' +
                '<input type="text" class="form-control"  readonly id="hoTenDkiCN" name="txtHoTenDKCN" value="' + model.hoTen + '" >' +
                '<small id="emailHelp" class="form-text text-muted">We\'ll never share your email with anyone else.</small> ' +
                '</div>' +
                '<div class="form-group">' +
                '<label for="exampleInputPassword1">Phòng ban</label>' +
                '<input class="form-control" type="text" readonly id="phongBanDkiCN" name="txtPBDKCN" value = "' + model.phongBan + '">' +
                '</div>' +
                '<div class="form-group">' +
                '<label for="exampleInputPassword1">ngày đăng ký</label>' +
                '<input class="form-control" type="text" readonly id="ngayDkiDkiCN" name="txtNDKDKCN" value = "' + ToJavaScriptDate(model.ngayDK) + '">' +
                '</div>' +
                '<table class="table table-sm">' +
                '<thead>' +
                '<tr>' +
                '<td>Ca 1</td>' +
                '<td>Ca 2</td>' +
                '<td>Ca 3</td>' +
                '</tr>' +
                '</thead>' +
                '<tbody>' +
                '<tr>' +
                '<td class="groupInputDKCN">' +
                '<input type="checkbox" class="checkbox-ca1" id="checkbox_ca1" onclick="EnableDisableTextBox(\'checkbox_ca1\',\'input_ca1\')" name="checkbox-ca1" >' +
                '<input name="txtSLC1DKCN" class="form-control" disabled type="number" class="form-control-sm" id="input_ca1" min=0 max=3 value = "' + model.SLCa1 + '">' +
                '' +
                '</td>' +
                '<td class="groupInputDKCN">' +
                '<input type="checkbox" class="checkbox-ca2" id="checkbox_ca2" onclick="EnableDisableTextBox(\'checkbox_ca2\',\'input_ca2\')" name="checkbox-ca2" value="" >' +
                '<input type="number" class="form-control" disabled name="txtSLC2DKCN" class="form-control-sm" id="input_ca2" min=0 max=3 value = "' + model.SLCa2 + '">' +
                '' +
                '' +
                '' +
                '</td>' +
                '<td class="groupInputDKCN">' +
                '<input type="checkbox" class="checkbox-ca3" id="checkbox_ca3" onclick="EnableDisableTextBox(\'checkbox_ca3\',\'input_ca3\')" name="checkbox-ca3" value="" >' +
                '<input type="number" class="form-control" disabled class="form-control-sm" name="txtSLC3DKCN" id="input_ca3" min=0 max=3 value = "' + model.SLCa3 + '" >' +
                '' +
                '' +
                '</td>' +
                '</tr>' +
                '' +
                '' +
                '</tbody>' +
                '</table>' +
                //'<label for="exampleInputPassword1">Ca 1</label>' +
                //    '<div class="input-group mb-3">' +
                //    '<div class="input-group-text">' +
                //    '<input type="checkbox" class="checkbox-ca1" id="checkbox_ca1" onclick = "EnableDisableTextBox(\'checkbox_ca1\',\'input_ca1\')" name = "checkbox-ca1" >' +
                //    '</div>' +
                //    '<input name="txtSLC1DKCN" class="form-control" disabled type="number" class="form-control-sm" id="input_ca1" min=0 max=3 value = "' + model.SLCa1 + '">' +
                //    '</div>' +
                //    '<label for="exampleInputPassword1">Ca 2</label>' +
                //    '<div class="input-group mb-3">' +

                //    '<div class="input-group-text">' +
                //    '<input  type="checkbox" class="checkbox-ca2" id="checkbox_ca2" onclick = "EnableDisableTextBox(\'checkbox_ca2\',\'input_ca2\')" name = "checkbox-ca2" value = "" >' +
                //    '</div>' +
                //    '<input type="number" class="form-control" disabled name="txtSLC2DKCN" class="form-control-sm" id="input_ca2" min=0 max=3 value = "' + model.SLCa2 + '">' +
                //    '</div>' +
                //    '<label for="exampleInputPassword1">Ca 3</label>' +
                //    '<div class="input-group mb-3">' +
                //    '<div class="input-group-text">' +
                //    '<input type="checkbox" class="checkbox-ca3" id="checkbox_ca3" onclick = "EnableDisableTextBox(\'checkbox_ca3\',\'input_ca3\')" name = "checkbox-ca3" value = "" >' +
                //    '</div>' +
                //    '<input type="number" class="form-control" disabled class="form-control-sm" name="txtSLC3DKCN" id="input_ca3" min=0 max=3 value = "' + model.SLCa3 + '" >' +
                //    '</div>' +
                '<button type="button" onclick="DKCNSubmit()" class="btn btn-primary" style="float:right;">Submit</button>' +
                '</form>' +
                '</div>';
            //var result =

            //    '<div class="card">' +
            //    ' <h5 class="text-center mb-4">phiếu đăng ký ăn cá nhân</h5>' +
            //    '<div class="form-card">' +
            //    '<form id="formdkicanhan">' +
            //    '<input type="text" name="txtTest2"/>' +
            //    '<div class="form-group col-sm-12 flex-column d-flex">' +
            //    '<label class="form-control-label px-3">Họ tên<span class="text-danger"> *</span></label>' +
            //    '<input type="text" readonly id="hoTenDkiCN" name="txtHoTenDKCN" value="' + model.hoTen + '" />'
            //    +
            //    '</div>' +
            //    '<div class="form-group col-sm-12 flex-column d-flex">' +
            //    '<label class="form-control-label px-3">Phòng ban<span class="text-danger"> *</span></label>' +
            //    '<input type="text" readonly id="phongBanDkiCN" name="txtPBDKCN" value = "' + model.phongBan + '" /> ' +
            //    '</div>' +
            //    '<div class="form-group col-sm-12 flex-column d-flex">' +
            //    '<label class="form-control-label px-3">Ngày đăng ký<span class="text-danger"> *</span></label>'
            //    +
            //    '<input type="text" readonly id="ngayDkiDkiCN" name="txtNDKDKCN" value = "' + ToJavaScriptDate(model.ngayDK) + '" /> ' +
            //    '</div>' +
            //    '<div class="row  text-left d-inline">' +

            //    '<div class="form-group col-12 flex-column d-flex">' +
            //    '<label class="form-control-label px-3">' + 'Ca 1<span class="text-danger">' + '*' +
            //    '</span>' + '</label>' +
            //    '<div class="d-inline p-2 bg-info  text-white rounded-top">' +
            //    '<input type="checkbox" class="checkbox-ca1" id="checkbox_ca1" onclick = "EnableDisableTextBox(\'checkbox_ca1\',\'input_ca1\')" name = "checkbox-ca1" > '
            //    +
            //    '</div>' +

            //    '<div class="">' +
            //    '<input name="txtSLC1DKCN" type="number" class="form-control" id="input_ca1"  value = "' + model.SLCa1 + '" /> ' + 'suất' +
            //    '</div>' +
            //    '</div>' +
            //    '</div>' +
            //    '<div class="row justify-content-between text-left d-inline">' +

            //    '<div class="form-group col-12 flex-column d-flex">' +
            //    '<label class="form-control-label px-3">' + 'Ca 2<span class="text-danger">' + '*' +
            //    '</span>' + '</label>' +
            //    '<div class="d-inline p-2 bg-info text-white rounded-top">' +
            //    '<input type="checkbox" class="checkbox-ca2" id="checkbox_ca2" onclick = "EnableDisableTextBox(\'checkbox_ca2\',\'input_ca2\')" name = "checkbox-ca2" value = "" > ' +
            //    '</div>' +
            //    '<div class="d-inline p-2 table-secondary  rounded-bottom">' +
            //    '<input type="text" name="txtSLC2DKCN" class="form-control" id="input_ca2"  value = "' + model.SLCa2 + '" /> ' + 'suất' +
            //    '</div>' +

            //    '</div>' +
            //    '</div>' +
            //    '<div class="row justify-content-between text-left d-inline">' +
            //    '<div class="form-group col-12 flex-column d-flex">' +
            //    '<label class="form-control-label px-3">' + 'Ca 3<span class="text-danger">' + '*' +
            //    '</span>' + '</label>' +
            //    '<div class="d-inline p-2 bg-info text-white rounded-top">' +
            //    '<input type="checkbox" class="checkbox-ca3" id="checkbox_ca3" onclick = "EnableDisableTextBox(\'checkbox_ca3\',\'input_ca3\')" name = "checkbox-ca3" value = "" > ' +
            //    '</div>' +
            //    '<div class="d-inline p-2 table-secondary rounded-bottom">' +
            //    '<input type="text" class="form-control" name="txtSLC3DKCN" id="input_ca3"  value = "' + model.SLCa3 + '" /> ' + 'suất' +
            //    '</div>' +
            //    '</div>' +
            //    '</div>' +
            //    '<div class="d-flex justify-content-around">' +
            //    '<div class="input-group col-sm-3">' +
            //    '<button type="button" onclick="DKCNSubmit()"' + ' class="btn-block btn-primary" id = "dkiCNSubmit">Đăng ký</button> ' +
            //    '</div>' +
            //    '<div class="input-group col-sm-3">' +
            //    '<input type="button" value="Cancel" class="btn-block btn--warning" href="~/Home/Index" />' +
            //    '</div>' +
            //    '</div>' +
            //    '</form>' +
            //    '</div>';

            $('#results').html(result);
            if ($('#phieuDKCN').length) {
                $('html, body').animate({
                    scrollTop: $('#phieuDKCN').offset().top - 100
                }, 'slow');
            }
        }
    });
});
function searchByString() {

    $.ajax({
        url: "/NhanVien/DanhSachNhanVien",
        type: 'GET',
        data: {
            SearchString: $('#txtSearchNhanVien').val()
        },
        success: function (items) {

            console.log(items);
            $('#results').html("");
            $('#btnAddNV').show();
            $('#searchBox').show();
            var result =
                '<h1>Danh sách nhân viên</h1>' +
                '<table class="table table-striped table-inverse" > ' +
                '<thead class="">' +
                '<tr class="text-md-center">' +
                '<th class="align-middle">Họ và tên</th>' +
                '<th class="align-middle">Phòng ban</th>' +
                '<th class="align-middle">Quyền trên hệ thống</th>' +
                '<th class="align-middle">Quyền đăng ký ca ăn</th>' +
                '<th class="align-middle">Ngày sinh</th>' +
                '<th class="align-middle">Giới tính</th>' +
                '<th class="align-middle">Email</th>' +
                '<th class="align-middle">Địa chỉ</th>' +

                '<th></th>' +
                '</tr>' +
                '</thead> ' +
                ' <tbody> ';


            $.each(items, function (id, item) {

                result +=
                    '<tr>' +
                    '<td>' + item.hoTen + '</td>' +
                    '<td>' + item.TenPhongBan + '</td>' +
                    '<td>' + item.TenRole + '</td>' +
                    '<td>' + item.quyen + '</td>' +
                    '<td>' + ToJavaScriptDate(item.birthday) + '</td>' +
                    '<td>' + formatSex(item.gioiTinh) + '</td>' +
                    '<td>' + item.email + '</td>' +
                    '<td>' + item.address + '</td>' +

                    '<td>' +
                    '<a href="#" onclick=LoadNhanVienById(' + item.ID + ') class="btn btn-outline-warning">Sửa</a>' +
                    '<a href="#" onclick=DeleteNhanVienById(' + item.ID + ') class="btn btn-outline-danger">Xóa</a>' +
                    '</td>' +
                    '</tr>';
            });
            result += '</tbody> </table>';
            $('#results').html(result);
        },
        error: function (err) {
            console.error(err);
        },
    });
}



function LoadNhanVienById(ID) {
    $('#checkUpdate').val(1);
    $.ajax({
        url: "/NhanVien/UpdateNhanVien",
        method: "GET",
        data: { ID: ID },
        success: function (item) {
            console.log(item);
            $('#ModalAddNhanVien').modal('show');
            $('#fullname').val(item.hoTen);
            $('#username').val(item.username);
            $('#password').val(item.password);
            $('#idNhanVien').val(ID);

            $('#dateofbirth').val(ToJavaScriptDateInput(item.birthday));
            $('#email').val(item.email);
            $('#address').val(item.address);

            if (item.gioiTinh == true) {
                $('#gioitinhnam').prop('checked', true);
            }
            else {
                $('#gioitinhnu').prop('checked', true);
            }
            if (item.quyen == "tap the") {
                $('#quyentapthe').prop('checked', true);

            }
            else if (item.quyen == "ca nhan") {
                $('#quyencanhan').prop('checked', true);
            }
            $.ajax({
                type: 'GET',
                url: '/NhanVien/getPhongBanDropDown',
                data: '{}',
                success: function (data) {

                    for (var i = 0; i < data.length; i++) {
                        if (item.IDPhongBan == data[i].ID) {
                            //s += '<option value="' + data[i].ID + '">' + data[i].TenPB + '</option>';
                            var s = '<option value="' + data[i].ID + '">' + data[i].TenPB + '</option>';
                        }

                    }
                    for (var i = 0; i < data.length; i++) {
                        if (item.IDPhongBan != data[i].ID) {
                            //s += '<option value="' + data[i].ID + '">' + data[i].TenPB + '</option>';
                            s += '<option value="' + data[i].ID + '">' + data[i].TenPB + '</option>';
                        }

                    }
                    //$('#dropdown-menuPhongBan').addClass('update');
                    console.log(s);
                    $("#phongban").html(s);

                }
            });
            $.ajax({
                type: 'GET',
                url: '/NhanVien/getQuyenHeThongDropDown',
                data: '{}',
                success: function (data) {

                    for (var i = 0; i < data.length; i++) {
                        if (item.IDRole == data[i].ID) {

                            var s = '<option value="' + data[i].ID + '">' + data[i].URole + '</option>';
                        }
                    }
                    for (var i = 0; i < data.length; i++) {
                        if (item.IDRole != data[i].ID) {
                            s += '<option value="' + data[i].ID + '">' + data[i].URole + '</option>';
                        }
                    }
                    $("#quyenhethong").html(s);

                }
            });
            $('#checkUpdate').val(1);
            $('#quyendangkycaan').val(item.quyen);
            $('#dropdown-menuQuyenHeThong').val(item.IDRole);
        },
        error: function (err) {
            console.error(err);
        },
    });
}
function LoadNhanViens() {
    $.ajax({
        url: "/NhanVien/DanhSachNhanVien",
        method: "GET",
        success: function (items) {
            //data = JSON.parse(items);
            //console.log(items);
            $('body').removeClass("show-sidebar");
            $('#btnCloseSidebar').removeClass("active");
            $('#results').html("");
            $('#searchBox').show();
            $('#txtSearchNhanVien').focus();
            $('#btnAddNV').show();

            var result =
                '<h1>Danh sách nhân viên</h1>' +
                '<table class="table table-striped table-inverse" > ' +
                '<thead class="">' +
                '<tr class="text-md-center">' +
                '<th class="align-middle">Họ và tên</th>' +
                '<th class="align-middle">Phòng ban</th>' +
                '<th class="align-middle">Quyền trên hệ thống</th>' +
                '<th class="align-middle">Quyền đăng ký ca ăn</th>' +
                '<th class="align-middle">Ngày sinh</th>' +
                '<th class="align-middle">Giới tính</th>' +
                '<th class="align-middle">Email</th>' +
                '<th class="align-middle">Địa chỉ</th>' +

                '<th></th>' +
                '</tr>' +
                '</thead> ' +
                ' <tbody> ';


            $.each(items, function (id, item) {

                console.log(item);
                result +=
                    '<tr>' +

                    '<td>' + item.hoTen + '</td>' +
                    '<td>' + item.TenPhongBan + '</td>' +
                    '<td>' + item.TenRole + '</td>' +
                    '<td>' + item.quyen + '</td>' +
                    '<td>' + ToJavaScriptDate(item.birthday) + '</td>' +
                    '<td>' + formatSex(item.gioiTinh) + '</td>' +
                    '<td>' + item.email + '</td>' +
                    '<td>' + item.address + '</td>' +

                    '<td>' +


                    '<a href="#" onclick=LoadNhanVienById(' + item.ID + ') class="btn btn-outline-warning">Sửa</a>' +
                    '<a href="#" onclick=DeleteNhanVienById(' + item.ID + ') class="btn btn-outline-danger">Xóa</a>' +
                    '</td>' +
                    '</tr>';
            });
            result += '</tbody> </table>';
            $('#results').html(result);
            if ($('#searchBox').length) {
                $('html, body').animate({
                    scrollTop: $('#searchBox').offset().top - 10
                }, 'slow');
            }
        },
        error: function (err) {
            console.error(err);
        },
    });


};

function showListPhongBan() {

    $.ajax({
        url: "/PhongBan/DSPhongBan",
        method: "GET",

        success: function (items) {
            $('#searchBox').hide();
            $('body').removeClass("show-sidebar");
            $('#btnCloseSidebar').removeClass("active");
            var result =

                ' <div class="row" id="searchBox" style="">' +
                '<div class="col-sm-6">' +
                '<h1>Danh sách phòng ban</h1>' +
                '</div>' +
                '<div class="col-sm-6">' +
                '<button type="button" id="" class="btn btn-success" tabindex="auto" data-toggle="modal" onclick="changeToAddStatus()" data-target="#ModalAddPB">' +
                'Thêm mới phòng ban' +
                '</button>' +
                '</div>' +
                '</div>' +
                '<table class="table table-striped table-inverse" > ' +
                '<thead class="">' +
                '<tr class="text-md-center">' +
                '<th class="align-middle">ID phòng ban</th>' +
                '<th class="align-middle">Tên phòng ban</th>' +

                '<th></th>' +
                '</tr>' +
                '</thead> ' +
                ' <tbody> ';


            $.each(items, function (id, item) {
                result +=
                    '<tr class="text-md-center">' +

                    '<td>' + item.ID + '</td>' +
                    '<td>' + item.TenPB + '</td>' +


                    '<td class="d-flex justify-content-center">' +
                    '<a href="#" onclick=LoadPhongBanById(' + item.ID + ') class="btn btn-outline-warning">Sửa</a>' +
                    '<a href="#" onclick=DeletePhongBanById(' + item.ID + ') class="btn btn-outline-danger">Xóa</a>' +
                    '</td>' +
                    '</tr>';
            });
            result += '</tbody> </table>';
            $('#results').html(result);

            if ($('#searchBox').length) {
                $('html, body').animate({
                    scrollTop: $('#searchBox').offset().top - 10
                }, 'slow');
            }
        }
    });

};
$('#ModalAddNhanVien').on('shown.bs.modal', function () {
    $('#fullname').focus();
});

$(document).ready(function () {

    var quyenDK = $('#quyenDK').val();
    var quyenTrenHeThong = $('#quyenTrenHeThong').val();
    //console.log(quyenDK && quyenTrenHeThong == 1);
    console.log('12331232');
    console.log(quyenDK);
    console.log(quyenTrenHeThong);
    if (quyenDK == "tap the") {
        $('#phanVungDKY').append('<li id="scroll-DKTT"><a href="/CaAn/TapThe">Đăng ký tập thể</a></li>');
    }
    if (quyenTrenHeThong == 1) {
        $('#nhomChucNang').prepend('<li class="accordion">' +
            '<a href = "#" data-toggle="collapse" data-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne" class= "collapsible">' +
            '<span class="icon-home mr-3"></span>Quản lý' +
            '</a>' +
            '<div id="collapseOne" class="collapse" aria-labelledby="headingOne">' +
            '<div>' +
            '<ul>' +
            '<li><a href="#" onclick="LoadNhanViens()">Nhân viên</a></li>' +
            '<li><a href="#" onclick="showListPhongBan()">Phòng ban</a></li>' +
            '</ul>' +
            '</div>' +
            '</div>' +
            '</li>'
        );
        $('#phanVungThongKe').append(
            '<li><a href="/BaoCao/ThongKeTheoNgay">Thống kê theo ngày</a></li >' +
            '<li><a href="/BaoCao/ThongKeTheoThang">Thống kê theo tháng</a></li >'
        );

    }



    $('#boLocDKTN').change(function () {
        var selectedValue = $(this).val();
        if (selectedValue == 'all') {
            $('#hienThiCa1').show();
            $('#hienThiCa2').show();
            $('#hienThiCa3').show();
        }
        else if (selectedValue == 'ca1') {
            $('#hienThiCa1').show();
            $('#hienThiCa2').hide();
            $('#hienThiCa3').hide();

        }
        else if (selectedValue == 'ca2') {
            $('#hienThiCa1').hide();
            $('#hienThiCa2').show();
            $('#hienThiCa3').hide();

        }
        else if (selectedValue == 'ca3') {
            $('#hienThiCa1').hide();
            $('#hienThiCa2').hide();
            $('#hienThiCa3').show();
        }
    });
    if ($('#mauThongKeCaNhan').length) {
        $('html, body').animate({
            scrollTop: $('#mauThongKeCaNhan').offset().top
        }, 'slow');
    }
    if ($('#mauThongKeTheoNgay').length) {
        $('html, body').animate({
            scrollTop: $('#mauThongKeTheoNgay').offset().top
        }, 'slow');
    }
    if ($('#mauThongKeTheoThang').length) {
        $('html, body').animate({
            scrollTop: $('#mauThongKeTheoThang').offset().top
        }, 'slow');
    }
    if ($('#phieuDKTT').length) {
        $('html, body').animate({
            scrollTop: $('#phieuDKTT').offset().top - 100
        }, 'slow');
    }


    $('#btnSubmitDKTT').click(function (e) {
        e.preventDefault();
        var checkGroupInputIsActive = false;
        $('.groupInput').each(function () {
            if ($(this).find('input[type="checkbox"]').is(':checked') && $(this).find('input[type="number"]').val() != 0) {
                checkGroupInputIsActive = true;
            }
        });
        if (checkGroupInputIsActive == true) {
            $("#formDKTT").submit();
        }
        else {
            alert('bạn chưa đăng kí ca ăn nào');
            console.log('không có cụm nào được dùng');

        }
    });
    //$("#show_hide_password a").on('click', function (event) {
    //    event.preventDefault();
    //    if ($('#show_hide_password input').attr("type") == "text") {
    //        $('#show_hide_password input').attr('type', 'password');
    //        $('#show_hide_password i').addClass("fa-eye-slash");
    //        $('#show_hide_password i').removeClass("fa-eye");
    //    } else if ($('#show_hide_password input').attr("type") == "password") {
    //        $('#show_hide_password input').attr('type', 'text');
    //        $('#show_hide_password i').removeClass("fa-eye-slash");
    //        $('#show_hide_password i').addClass("fa-eye");
    //    }
    //});
    $.validator.addMethod("minAge", function (value, element, min) {
        var today = new Date();
        var birthDate = new Date(value);
        var age = today.getFullYear() - birthDate.getFullYear();

        if (age > min + 1) { return true; }

        var m = today.getMonth() - birthDate.getMonth();

        if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) { age--; }

        return age >= min;
    }, "Chưa đủ tuổi");
    //$('#NhanVienTable').DataTable({

    //    "ajax": {
    //        "url": "/NhanVien/getData",
    //        "type": "GET",
    //        "dataType":"json"
    //        },
    //    "columns": [
    //        { "data": "ID" },
    //        { "data": "IDPhongBan" },
    //        { "data": "username" },
    //        { "data": "upassword" },
    //        { "data": "IDrole" },
    //        { "data": "quyen" },
    //        { "data": "trangThai" },
    //        { "data": "hoTen" },
    //        { "data": "gioiTinh" },
    //        { "data": "phone" },
    //        { "data": "email" },
    //        { "data": "diaChi" },
    //        { "data": "ngaySinh" },
    //    ],

    //});
    $('#formaddnhanvien').validate({
        rules: {
            txtHoTen: {
                required: true,
                minlength: 5

            },
            txtTenDangNhap: "required",
            txtPassword: "required",
            txtNgaySinh: {
                required: true,
                minAge: true
            },
            txtEmail: {
                required: true,
                email: true

            },
            txtDiaChi: "required",
            phongbandropdown: {
                min: 1,
            },
            quyenhethongdropdown: {
                min: 1
            }
        },
        messages: {
            txtHoTen: {

                required: "thiếu họ tên",
                minlength: "tên phải lớn hơn 5 ký tự"
            },
            txtTenDangNhap: "thiếu tên đăng nhập",
            txtPassword: "thiếu password",
            txtNgaySinh: {
                required: "Thiếu ngày sinh",
                minAge: "chưa đủ 13 tuổi"
            },
            txtEmail: {
                required: "thiếu email",
                email: "email không hợp lệ"

            },
            txtDiaChi: "thiếu địa chỉ",
            phongbandropdown: {
                min: "vui lòng chọn phòng ban",
            },
            quyenhethongdropdown: {
                min: "vui lòng chọn quyền hệ thống"
            }
        }

    });
    $.ajax({
        type: 'GET',
        url: '/NhanVien/getPhongBanDropDown',
        data: '{}',
        success: function (data) {
            var s = '<option value="-1">Chọn phòng ban</option>';
            for (var i = 0; i < data.length; i++) {
                s += '<option value="' + data[i].ID + '">' + data[i].TenPB + '</option>';
            }
            $("#phongban").html(s);

        }
    });
    $.ajax({
        type: 'GET',
        url: '/NhanVien/getQuyenHeThongDropDown',
        data: '{}',
        success: function (data) {
            var s = '<option value="-1">Chọn quyền hệ thống</option>';
            for (var i = 0; i < data.length; i++) {
                s += '<option value="' + data[i].ID + '">' + data[i].URole + '</option>';
            }
            $("#quyenhethong").html(s);

        }
    });
    $('#btnAddNV').click(function () {
        $('#checkUpdate').val(0);

        $('#fullname').val("");
        $('#username').val("");
        $('#password').val("");
        //console.log(ToJavaScriptDate(item.birthday));
        $('#dateofbirth').val("");
        $('#email').val("");
        $('#address').val("");
        $('#quyencanhan').prop('checked', true);
        $('#gioitinhnam').prop('checked', true);
        $.ajax({
            type: 'GET',
            url: '/NhanVien/getPhongBanDropDown',
            data: '{}',
            success: function (data) {
                var s = '<option value="-1">Chọn phòng ban</option>';
                for (var i = 0; i < data.length; i++) {
                    s += '<option value="' + data[i].ID + '">' + data[i].TenPB + '</option>';
                }
                $("#phongban").html(s);

            }
        });
        $.ajax({
            type: 'GET',
            url: '/NhanVien/getQuyenHeThongDropDown',
            data: '{}',
            success: function (data) {
                var s = '<option value="-1">Chọn quyền hệ thống</option>';
                for (var i = 0; i < data.length; i++) {
                    s += '<option value="' + data[i].ID + '">' + data[i].URole + '</option>';
                }
                $("#quyenhethong").html(s);

            }
        });


    });
    $('#formaddPB').validate({
        rules: {
            txtAddModalTenPB: {
                required: true,
                minlength: 5,
                maxlength: 100
            },
        },
        messages: {
            txtAddModalTenPB: {
                required: "không được để trống",
                minlength: "chiều dài tối thiểu là 5 tối đa là 100",
                maxlength: "chiều dài tối thiểu là 5 tối đa là 100"
            },

        }
    });
    $('#btnAddPB').click(function () {
        console.log($('#checkAddOrUpdatePB').val());
        if ($('#formaddPB').valid()) {

            var tenPB = $('#txtAddModalTenPB').val();
            if ($('#checkAddOrUpdatePB').val() == 0) {

                $("#btnAddPB").html("Thêm mới");
                $.ajax({
                    url: "/PhongBan/AddNewPB",
                    method: 'POST',
                    data: {
                        tenPB: tenPB
                    },
                    success: function () {
                        alert('thêm mới thành công');
                        $('#ModalAddPB').modal('hide');
                        showListPhongBan();
                    },
                    error: function (err) {
                        alert('có lỗi xảy ra ở thêm mới');
                    }
                });
            }
            else if ($('#checkAddOrUpdatePB').val() == 1) {
                var ID = $('#txtIDPhongBan').val();
                console.log(ID);
                $("#btnAddPB").html("Cập nhật");

                $.ajax({
                    url: "/PhongBan/UpdateNewPB",
                    method: 'POST',
                    data: {
                        ID: ID,
                        tenPB: tenPB
                    },
                    success: function () {
                        alert('Cập nhật thành công');
                        $('#ModalAddPB').modal('hide');
                        showListPhongBan();
                    },
                    error: function (err) {
                        alert('có lỗi xảy ra ở update');
                    }
                });
            }

        }

    });
    $('#btnLuu').click(function () {
        if ($('#formaddnhanvien').valid()) {
            var fullname = $('#fullname').val();
            var username = $('#username').val();
            var password = $('#password').val();
            var dateofbirth = $('#dateofbirth').val();
            var email = $('#email').val();
            var address = $('#address').val();
            var sex = $('#checkboxsex input:radio:checked').val();
            var phongban = $('#phongban').val();
            var quyendangkycaan = $('#quyendangkycaan input:radio:checked').val();
            var quyentrenhethong = $('#quyenhethong option:selected').val();
            var ID = $('#idNhanVien').val();
            var checkUpdate = $('#checkUpdate').val();
            console.log("checkUpdate=" + checkUpdate);
            var nhanVien = {
                hoten: fullname,
                username: username,
                upassword: password,
                ngaySinh: dateofbirth,
                email: email,
                diaChi: address,
                gioiTinh: sex,
                IDPhongBan: phongban,
                quyen: quyendangkycaan,
                IDrole: quyentrenhethong
            };
            if (checkUpdate == 0) {
                $.ajax({
                    url: '/NhanVien/AddNhanVien',
                    type: 'POST',
                    data: nhanVien,
                    success: function (res) {
                        if (res.success) {
                            $('#ModalAddNhanVien').modal('hide');
                            alert('Thêm mới thành công!');
                            LoadNhanViens();
                        }
                    }
                });
            }
            else if (checkUpdate == 1) {
                var nhanVien = {
                    ID: ID,
                    hoten: fullname,
                    username: username,
                    upassword: password,
                    ngaySinh: dateofbirth,
                    email: email,
                    diaChi: address,
                    gioiTinh: sex,
                    IDPhongBan: phongban,
                    quyen: quyendangkycaan,
                    IDrole: quyentrenhethong
                };
                $.ajax({
                    url: '/NhanVien/UpdateNhanVien',
                    type: 'POST',
                    data: nhanVien,
                    success: function (res) {
                        if (res.success) {
                            $('#ModalAddNhanVien').modal('hide');
                            alert('Update thành công. Đăng nhập lại để áp dụng thay đổi');
                            searchByString();
                        }
                    }
                });
            }


        }

    });
});
function TestFunction() {
    $('#formtest').validate({
        rules: {
            txtTest: {
                maxlength: 1
            }
        },
        messages: {
            txtTest: {
                maxlength: "độ dài không được lớn hơn 3"
            }
        }
    });

    if ($('#formtest').valid()) {
        alert($('#idTest').val());
        console.log($('#idTest').val());
    } else {
        alert('test loi');
    }
}
function DKCNSubmit() {

    var checkGroupInputDKCNIsActive = false;
    $('.groupInputDKCN').each(function () {
        if ($(this).find('input[type="checkbox"]').is(':checked') && $(this).find('input[type="number"]').val() != 0) {
            checkGroupInputDKCNIsActive = true;
        }
    });
    if (checkGroupInputDKCNIsActive == true) {
        var hoTen = $('#hoTenDkiCN').val();
        var phongBan = $('#phongBanDkiCN').val();
        var ngayDK = $('#ngayDkiDkiCN').val();
        var SLCa1 = $('#input_ca1').val();
        var SLCa2 = $('#input_ca2').val();
        var SLCa3 = $('#input_ca3').val();
        var IDPhongBan = $('#DCCNIDpb').val();
        var ID_NDK = $('#DKCNID_ND').val();
        var model = {
            hoTen: hoTen,
            phongBan: phongBan,
            ngayDK: ngayDK,
            SLCa1: SLCa1,
            SLCa2: SLCa2,
            SLCa3: SLCa3,
            IDPhongBan: IDPhongBan,
            ID_NDK: ID_NDK,
        }
        console.log(model);


        $.ajax({
            url: '/CaAn/DkiCaNhan',
            method: 'POST',
            data: {
                model: model
            },
            success: function (url) {
                alert('thêm mới thành công');
                window.location.href = url;

            }, error: function (err) {
                alert('có lỗi');
            }

        });
    }
    else {
        alert('bạn chưa đăng kí ca ăn nào');
        console.log('không có cụm nào được dùng');

    }

    //$('#formdkicanhan').validate({
    //    rules: {
    //        txtSLC1DKCN: {
    //            min: 0,
    //            max: 3
    //        },
    //        txtSLC2DKCN: {
    //            min: 0,
    //            max: 3
    //        },
    //        txtSLC3DKCN: {
    //            min: 0,
    //            max: 3
    //        }
    //    },
    //    messages: {
    //        txtSLC1DKCN: {
    //            min: "không được nhỏ hơn 0",
    //            max: "giá trị không được vượt quá 3"
    //        },
    //        txtSLC2DKCN: {
    //            min: "không được nhỏ hơn 0",
    //            max: "giá trị không được vượt quá 3"
    //        },
    //        txtSLC3DKCN: {
    //            min: "không được nhỏ hơn 0",
    //            max: "giá trị không được vượt quá 3"
    //        },
    //    }
    //});
    //if ($('#formdkicanhan').valid()) {

    //    var hoTen = $('#hoTenDkiCN').val();
    //    var phongBan = $('#phongBanDkiCN').val();
    //    var ngayDK = $('#ngayDkiDkiCN').val();
    //    var SLCa1 = $('#input_ca1').val();
    //    var SLCa2 = $('#input_ca2').val();
    //    var SLCa3 = $('#input_ca3').val();
    //    var IDPhongBan = $('#DCCNIDpb').val();
    //    var ID_NDK = $('#DKCNID_ND').val();
    //    var model = {
    //        hoTen: hoTen,
    //        phongBan: phongBan,
    //        ngayDK: ngayDK,
    //        SLCa1: SLCa1,
    //        SLCa2: SLCa2,
    //        SLCa3: SLCa3,
    //        IDPhongBan: IDPhongBan,
    //        ID_NDK: ID_NDK,
    //    }
    //    console.log(model);


    //    $.ajax({
    //        url: '/CaAn/DkiCaNhan',
    //        method: 'POST',
    //        data: {
    //            model: model
    //        },
    //        success: function (url) {
    //            alert('thêm mới thành công');
    //            window.location.href = url;

    //        }, error: function (err) {
    //            alert('có lỗi');
    //        }

    //    });
    //}

}
function LoadPhongBanById(ID) {
    $('#checkAddOrUpdatePB').val(1);
    $('#txtIDPhongBan').val(ID);
    console.log($('#txtIDPhongBan').val());
    $('#btnAddPB').html("Cập nhật");

    $.ajax({
        url: "/PhongBan/GetPhongBanById",
        method: 'GET',
        data: { ID: ID },
        success: function (model) {
            $('#ModalAddPB').modal('show');
            $('#txtAddModalTenPB').val(model.TenPB);
            $('#checkAddOrUpdatePB').val(1);
            $('#IDPhongBan').val(ID);
        }

    });
}
function changeToAddStatus() {
    $('#checkAddOrUpdatePB').val(0);
    //console.log($('#checkAddOrUpdatePB').val());
    $('#txtAddModalTenPB').val("");
}
function changeToUpdateStatus() {
    $('#checkAddOrUpdatePB').val(1);
}
$('#BtnThemMoiPhongBan').click(function () {
    if ($('#checkAddOrUpdatePB').val() == 0) {
        $('#btnAddPB').html("Thêm mới");
    }
    else if ($('#checkAddOrUpdatePB').val() == 1) {
        $('#btnAddPB').html("Cập nhật");
    }

});
function DeleteNhanVienById(ID) {
    $('#results').append('<input type="hidden" id="hiddenIDNV" value="' + ID + '">');
    $('#alertModal').modal('show');
    $('#checkAlertIsNVorPB').val("NhanVien");
    console.log($('#checkAlertIsNVorPB').val());
    $('#AlertContent').html("Bạn chắc chắn muốn xóa nhân viên này?");
    console.log(ID);

}
function DeletePhongBanById(ID) {
    $('#results').append('<input type="hidden" id="hiddenIDPB" value="' + ID + '">');
    $('#alertModal').modal('show');
    $('#checkAlertIsNVorPB').val("PhongBan");
    console.log($('#checkAlertIsNVorPB').val());
    $('#AlertContent').html("Bạn chắc chắn muốn xóa phòng ban này?");
    console.log(ID);



};
$('#confirmDelete').click(function () {

    if ($('#checkAlertIsNVorPB').val() == "NhanVien") {
        var ID = $('#hiddenIDNV').val();
        console.log('hiddenIDNV là:' + ID);
        debugger;
        $.ajax({
            url: "/NhanVien/DeleteNhanVien",
            method: 'POST',
            data: { ID: ID },
            success: function (success) {
                alert('xóa nhân viên thành công');
                $('#alertModal').modal('hide');
                LoadNhanViens();

            },
            error: function (err) {
                alert('xóa nhân viên thất bại');
                $('#alertModal').modal('hide');


            }

        });
        $('#hiddenIDNV').remove();
    }
    else if ($('#checkAlertIsNVorPB').val() == "PhongBan") {
        var ID = $('#hiddenIDPB').val();
        console.log('hiddenIDPB là:' + ID);
        $.ajax({
            url: "/PhongBan/DeletePhongBan",
            method: 'GET',
            data: { ID: ID },
            success: function (success) {
                alert('xóa phòng ban thành công');
                $('#alertModal').modal('hide');
                showListPhongBan();
            },
            error: function (err) {
                alert('xóa phòng ban thất bại');
                $('#alertModal').modal('hide');
            }


        });

        $('#hiddenIDPB').remove();
    }
});

$('#timKiemTheoNgay').click(function (e) {
    var dateStart = $('#dateStart').val();
    var dateEnd = $('#dateEnd').val();
    if (dateStart > dateEnd) {
        //setTimeout(() => {
        //alert('ngày bắt đầu phải nhỏ hơn ngày kết thúc');
        //}, 3000);
        alert('ngày bắt đầu phải nhỏ hơn ngày kết thúc');
        debugger;
        e.preventDefault();
    }
    else {
        if ($('.form-bao-cao').attr("id") == "myForm") {
            $('#myForm').submit();

        }
        else if ($('.form-bao-cao').attr("id") == "myFormBCCN") {
            $('#myFormBCCN').submit();
        }
    }

});
