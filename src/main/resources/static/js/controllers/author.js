'use strict'
angular.module('app.controllers', [])

.controller('GetAuthorQuotesCtrl', function($scope, $state, AuthorService) {
		AuthorService.get({authorId: $state.authorId},function(author){	
			$scope.author = author;
			)};
});