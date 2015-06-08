## About ##

**OpenJSIP** is a GNU GPL licensed bundle of free **distributed** SIP services run by Java VM.<br>
<b>Distributed</b> means that these services can be deployed on different hosts communicating with each other with the help of <a href='http://java.sun.com/javase/technologies/core/basic/rmi/index.jsp'>Remote Method Invocation (RMI)</a>. Distributed architecture allows creation of redundant and load-balanced systems.<br>
<br>
<br>
At the current stage of development <b>(v0.0.4)</b> the project includes:<br>
<ul><li>SIP Proxy<br>
<ul><li>Statefull operation<br>
</li><li>Stateless operation</li></ul></li></ul>

<ul><li>SIP Registrar<br>
<ul><li>Standalone (can listen to requests itself)<br>
</li><li>ViaProxy (proxy listens to requests and deliver registrations to registrar)</li></ul></li></ul>

<ul><li>SIP Location Service<br>
<ul><li>No database integration. Keeps data in memory (for now)</li></ul></li></ul>

OpenJSIP is based on SIP stack provided by <a href='http://code.google.com/p/jain-sip/'>JAIN-SIP project</a>. Thanks to all the authors for this incredible work.<br>
<br>
<a href='http://code.google.com/p/openjsip/wiki/Screenshots'>Here are some silly screenshots.</a>

<h2>Architecture</h2>

<ul><li><b>OpenJSIP services running on one host</b>
<img src='http://openjsip.googlecode.com/svn/res/Drawing1.png' />
</li><li><b>OpenJSIP services running on separate hosts (distributed model)</b>
<img src='http://openjsip.googlecode.com/svn/res/Drawing2.png' /></li></ul>

<h2>Documentation</h2>

Project distribution package contains OpenJSIP source code documentation and <a href='http://code.google.com/p/openjsip/source/browse/readme.txt'>readme</a> file with all instructions on how to use it.<br>
Here you can also view a <a href='http://code.google.com/p/openjsip/source/browse/changelog.txt'>changelog</a>.<br>
<br>
<h2>Download</h2>
<ul><li><a href='http://code.google.com/p/openjsip/downloads/list'>The latest complete package with binaries ( Windows &amp; UNIX ) and sources</a></li></ul>

<ul><li><a href='http://code.google.com/p/openjsip/source/checkout'>The most recent sources</a>
</li></ul><blockquote>You can also <a href='http://code.google.com/p/openjsip/source/browse/'>browse</a> the code online.</blockquote>

<i>P.S. Please <a href='http://code.google.com/p/openjsip/issues/list'>send</a> your comments. Thus we will know that people are interested in this project and we will continue developing it. Give us feature requests and usability requests.</i>

<h2>Requirements</h2>
<ul><li><a href='http://java.sun.com/'>Java Runtime Environment 6 (1.6)</a> or later installed.<br>
</li><li>(Optional) <a href='http://oss.oetiker.ch/rrdtool/'>RRDTool</a> installed for rendering performance graphs.</li></ul>

<h2>Supported platforms</h2>
<ul><li>Any UNIX like OS<br>
</li><li>Windows, as always.</li></ul>

<h2>Volunteers wanted</h2>
Everyone is welcomed to make an intellectual donation into further development of project.<br>
If you wish to collaborate, click <a href='http://code.google.com/p/support/wiki/HowToJoinAProject'>here</a>, and if you don't wish to read all this stuff, simple email me: ykrapiva at gmail.com or write me to ICQ 78446124.<br>
