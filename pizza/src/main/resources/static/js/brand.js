$(document).ready(function(){
            $('.bxslider').bxSlider( {
                mode: 'horizontal',// 가로 방향 수평 슬라이드
                speed: 500,        // 이동 속도를 설정
                pager: false,      // 현재 위치 페이징 표시 여부 설정
                moveSlides: 1,     // 슬라이드 이동시 개수
                auto: true,        // 자동 실행 여부
                slideWidth: 1000,
                captions: true
            });

        });