angular.module('jogo-quiz').config(function ($routeProvider) {
    $routeProvider
        .when('/ProfessorLogin', {
            templateUrl: 'views/professorLogin.html',
            controller: 'ProfessorLoginController'
        })
        .when('/', {
            templateUrl: 'views/home.html',
            controller: 'JogoQuizController'
        })
        .otherwise({
            redirectTo: '/'
        });
});
