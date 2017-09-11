'use strict'

angular.module('app.services', []) 

.factory('QuoteService', function($resource) {
	return $resource('/api/quote/:id', {id:'@_id'}, {
		random: {
			method: 'GET',
			url: '/api/quote/random'
		}
	});
})

.factory('AuthorService', function($resource){
	return $resource('/api/:author', {author:'@_author'}, {
		random: {
			method: 'GET',
			url: '/api/author'
		}
	});
});
