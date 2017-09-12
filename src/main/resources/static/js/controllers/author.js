'use strict'

angular.module('app.controllers', [])

.controller('GetAuthorQuoteCtrl', function($scope, $stateParams, AuthorService) {
		AuthorService.get({authorId:$stateParams.authorId}, function(author) {
	$scope.author = author;
	});
});