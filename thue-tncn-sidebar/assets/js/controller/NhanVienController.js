

var user = {
    init: function () {
        user.registerEvents();
    },
    registerEvents: function () {
        $(".btn-active").off('click').on('click', function (e) {
            e.preventDefault();
            var btn = $(this);
            var id = btn.data('id');
            $.ajax({
                url: "/NhanVien/ChangeStatus",
                type: 'POST',
                data: { id: id },

                success: function (response) {
                    console.log(response);
                    if (response.quyen == "ca nhan") {
                        btn.text('ca nhan');
                    }
                    else if (response.quyen == "tap the") {
                        btn.text('tap the');
                    }
                }
            });
        });
    }
}

user.init();
