/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    $("#r1").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSum1()
                        });
            });
    $(".r2").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSum2()
                        });
            });
    $(".r3").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSum3()
                        });
            });
    $(".c1").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSumc1()
                        });
            });
    $(".c2").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSumc2()
                        });
            });
    $(".c3").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSumc3()
                        });
            });
    $(".c4").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSumc4()
                        });
            });
    $(".c5").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSumc5()
                        });
            });
    $(".c6").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSumc6()
                        });
            });
    $(".c7").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSumc7()
                        });
            });
    $(".c8").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSumc8()
                        });
            });
    $(".c9").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSumc9()
                        });
            });
    $(".c10").each(
            function () {
                $(this).keyup(
                        function () {
                            calculateSumc10()
                        });
            });
});

function calculateSum1() {
    var sum1 = 0;
    $("#r1").each(
            function () {
                console.log(this.value);
                var vl1 = this.value.split(',').join('');
                console.log('Replaced: ' + vl1);
                if (!isNaN(vl1) && vl1.length != 0) {
                    sum1 += parseFloat(vl1);
                }
            });

    $("#over1").val(sum1.toFixed(2));
}

$(document).ready(function () {
    $('input#r1').keyup(function (event) {
        // skip for arrow keys
        if (event.which >= 37 && event.which <= 40) {
            event.preventDefault();
        }
        var $this = $(this);
        var num = $this.val().replace(/,/gi, "").split("").reverse().join("");

        var num2 = RemoveRougeChar(num.replace(/(.{3})/g, "$1,").split("").reverse().join(""));

        console.log(num2);


        // the following line has been simplified. Revision history contains original.
        $this.val(num2);
    });
});

function RemoveRougeChar(convertString) {


    if (convertString.substring(0, 1) == ",") {

        return convertString.substring(1, convertString.length)

    }
    return convertString;

}

// row 2


function calculateSum2() {
    var sum2 = 0;
    $(".r2").each(
            function () {
                console.log(this.value);
                var vl2 = this.value.split(',').join('');
                console.log('Replaced: ' + vl2);
                if (!isNaN(vl2) && vl2.length != 0) {
                    sum2 += parseFloat(vl2);
                }
            });

    $(".over2").val(sum2.toFixed(2));
}

$(document).ready(function () {
    $('.r2').on('keyup',function (event) {
        // skip for arrow keys
        if (event.which >= 37 && event.which <= 40) {
            event.preventDefault();
        }
        var $this = $(this);
        var num = $this.val().replace(/,/gi, "").split("").reverse().join("");

        var num2 = RemoveRougeChar(num.replace(/(.{3})/g, "$1,").split("").reverse().join(""));

        console.log(num2);


        // the following line has been simplified. Revision history contains original.
        $this.val(num2);
    });
});


//r3



function calculateSum3() {
    var sum3 = 0;
    $(".r3").each(
            function () {
                console.log(this.value);
                var vl3 = this.value.split(',').join('');
                console.log('Replaced: ' + vl3);
                if (!isNaN(vl3) && vl3.length != 0) {
                    sum3 += parseFloat(vl3);
                }
            });

    $(".over3").val(sum3.toFixed(2));
}

$(document).ready(function () {
    $('input.r3').keyup(function (event) {
        // skip for arrow keys
        if (event.which >= 37 && event.which <= 40) {
            event.preventDefault();
        }
        var $this = $(this);
        var num = $this.val().replace(/,/gi, "").split("").reverse().join("");

        var num2 = RemoveRougeChar(num.replace(/(.{3})/g, "$1,").split("").reverse().join(""));

        console.log(num2);


        // the following line has been simplified. Revision history contains original.
        $this.val(num2);
    });
});

function calculateSumc1() {
    var sum1 = 0;
    $(".c1").each(
            function () {
                console.log(this.value);
                var vl1 = this.value.split(',').join('');
                console.log('Replaced: ' + vl1);
                if (!isNaN(vl1) && vl1.length != 0) {
                    sum1 += parseFloat(vl1);
                }
            });

    $(".gddov1").val(sum1.toFixed(2));
}

function calculateSumc2() {
    var sumc2 = 0;
    $(".c2").each(
            function () {
                console.log(this.value);
                var vl1 = this.value.split(',').join('');
                console.log('Replaced: ' + vl1);
                if (!isNaN(vl1) && vl1.length != 0) {
                    sumc2 += parseFloat(vl1);
                }
            });

    $(".gddov2").val(sumc2.toFixed(2));
}

function calculateSumc3() {
    var sumc3 = 0;
    $(".c3").each(
            function () {
                console.log(this.value);
                var vl1 = this.value.split(',').join('');
                console.log('Replaced: ' + vl1);
                if (!isNaN(vl1) && vl1.length != 0) {
                    sumc3 += parseFloat(vl1);
                }
            });

    $(".gddov3").val(sumc3.toFixed(2));
}

function calculateSumc4() {
    var sumc4 = 0;
    $(".c4").each(
            function () {
                console.log(this.value);
                var vlc4 = this.value.split(',').join('');
                console.log('Replaced: ' + vlc4);
                if (!isNaN(vlc4) && vlc4.length != 0) {
                    sumc4 += parseFloat(vlc4);
                }
            });

    $(".gddov4").val(sumc4.toFixed(2));
}

function calculateSumc5() {
    var sumc5 = 0;
    $(".c5").each(
            function () {
                console.log(this.value);
                var vlc5 = this.value.split(',').join('');
                console.log('Replaced: ' + vlc5);
                if (!isNaN(vlc5) && vlc5.length != 0) {
                    sumc5 += parseFloat(vlc5);
                }
            });

    $(".gddov5").val(sumc5.toFixed(2));
}

function calculateSumc6() {
    var sumc6 = 0;
    $(".c6").each(
            function () {
                console.log(this.value);
                var vlc6 = this.value.split(',').join('');
                console.log('Replaced: ' + vlc6);
                if (!isNaN(vlc6) && vlc6.length != 0) {
                    sumc6 += parseFloat(vlc6);
                }
            });

    $(".gddov6").val(sumc6.toFixed(2));
}

function calculateSumc7() {
    var sumc7 = 0;
    $(".c7").each(
            function () {
                console.log(this.value);
                var vlc7 = this.value.split(',').join('');
                console.log('Replaced: ' + vlc7);
                if (!isNaN(vlc7) && vlc7.length != 0) {
                    sumc7 += parseFloat(vlc7);
                }
            });

    $(".gddov7").val(sumc7.toFixed(2));
}

function calculateSumc8() {
    var sumc8 = 0;
    $(".c8").each(
            function () {
                console.log(this.value);
                var vlc8 = this.value.split(',').join('');
                console.log('Replaced: ' + vlc8);
                if (!isNaN(vlc8) && vlc8.length != 0) {
                    sumc8 += parseFloat(vlc8);
                }
            });

    $(".gddov8").val(sumc8.toFixed(2));
}

function calculateSumc9() {
    var sumc9 = 0;
    $(".c9").each(
            function () {
                console.log(this.value);
                var vlc9 = this.value.split(',').join('');
                console.log('Replaced: ' + vlc9);
                if (!isNaN(vlc9) && vlc9.length != 0) {
                    sumc9 += parseFloat(vlc9);
                }
            });

    $(".gddov9").val(sumc9.toFixed(2));
}

function calculateSumc10() {
    var sumc10 = 0;
    $(".c10").each(
            function () {
                console.log(this.value);
                var vlc10 = this.value.split(',').join('');
                console.log('Replaced: ' + vlc10);
                if (!isNaN(vlc10) && vlc10.length != 0) {
                    sumc10 += parseFloat(vlc10);
                }
            });

    $(".gddov10").val(sumc10.toFixed(2));
}

$(document).ready(function () {
    $('input.c1','input.c2','input.c3','input.c4','input.c5','input.c6','input.c7','input.c8','input.c9','input.c10').keyup(function (event) {
        // skip for arrow keys
        if (event.which >= 37 && event.which <= 40) {
            event.preventDefault();
        }
        var $this = $(this);
        var num = $this.val().replace(/,/gi, "").split("").reverse().join("");

        var num2 = RemoveRougeChar(num.replace(/(.{3})/g, "$1,").split("").reverse().join(""));

        console.log(num2);


        // the following line has been simplified. Revision history contains original.
        $this.val(num2);
    });
    $('input.c2').keyup(function (event) {
        // skip for arrow keys
        if (event.which >= 37 && event.which <= 40) {
            event.preventDefault();
        }
        var $this = $(this);
        var num = $this.val().replace(/,/gi, "").split("").reverse().join("");

        var num2 = RemoveRougeChar(num.replace(/(.{3})/g, "$1,").split("").reverse().join(""));

        console.log(num2);


        // the following line has been simplified. Revision history contains original.
        $this.val(num2);
    });
});

