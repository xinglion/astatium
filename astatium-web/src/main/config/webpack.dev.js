/**
 * Copyright 2016 Phillip DuLion
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
var webpackMerge = require('webpack-merge');
var ExtractTextPlugin = require('extract-text-webpack-plugin');
var commonConfig = require('./webpack.common.js');
var helpers = require('./helpers');

module.exports = webpackMerge(commonConfig, {
	devtool : 'cheap-module-eval-source-map',

	output : {
		path : helpers.root('target/classes/META-INF/resource'),
		publicPath : 'http://localhost:9080/',
		filename : '[name].js',
		chunkFilename : '[id].chunk.js'
	},

	plugins : [ new ExtractTextPlugin('[name].css') ],

	devServer : {
		historyApiFallback : true,
		stats : 'minimal'
	}
});