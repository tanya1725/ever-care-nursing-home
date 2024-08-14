"use strict";(self.__LOADABLE_LOADED_CHUNKS__=self.__LOADABLE_LOADED_CHUNKS__||[]).push([[13254,47018],{276602:(e,t,n)=>{n.d(t,{E:()=>a,S:()=>i});var r=n(425288);let{Provider:i,useMaybeHook:a}=(0,r.Z)("pwtSurfaceContext")},991067:(e,t,n)=>{n.d(t,{Z:()=>o});var r=n(969853);let i=()=>{var e;return!!(null!==(e=window.performance)&&void 0!==e&&e.timing)};var a=n(985271);function o(e){return!!("desktop"!==e||i())&&!!a.Z&&(0,r.v)()}},226464:(e,t,n)=>{n.d(t,{KJ:()=>d,Rp:()=>u});let r={id:14,name:"own_profile"},i={id:15,name:"other_profile"},a={initial_app_load:{unauth:{board:{id:114,name:"board_page_interactive"},pin_closeup:{id:113,name:"pin_page_interactive"},other_profile:{id:115,name:"user_page_interactive"},topic:{id:119,name:"topic_page_interactive"},sterling_signup:{id:201,name:"sterling_signup_main_pageload"},sterling_login:{id:202,name:"sterling_login_main_pageload"}},auth:{bizhub:{id:607,name:"bizhub_pinteractive"},homefeed:{id:19,name:"home_feed_pinteractive"},sterling_reporting_overview:{id:219,name:"sterling_reporting_overview_pageload"},sterling_ads_create:{id:221,name:"sterling_adscreate_main_pageload"},sterling_ads_duplicate:{id:206,name:"sterling_adsduplication_main_pageload"},sterling_ads_edit:{id:204,name:"sterling_adsedit_main_pageload"},sterling_billing_profile:{id:203,name:"sterling_billingprofile_main_pageload"},sterling_bulk_editor:{id:205,name:"sterling_bulkeditor_main_pageload"},sterling_pin_builder:{id:222,name:"sterling_adscreate_pinbuilder_pageload"},sterling_recommendations:{id:223,name:"sterling_recommendations_pageload"},sterling_reporting_details:{id:218,name:"sterling_reporting_details_pageload"}}},client_route_push:{unauth:{},auth:{bizhub:{id:608,name:"bizhub_page_render"},homefeed:{id:2,name:"home_feed_render"},search:{id:3,name:"search_feed_render"},search_tab:{id:25,name:"search_tab_render"},pin_closeup:{id:13,name:"pin_closeup_details"},sterling_audiences:{id:224,name:"sterling_audiences_page_user_nav"},sterling_ads_edit:{id:225,name:"sterling_edit_flow_user_nav"},sterling_reporting_overview:{id:226,name:"sterling_reporting_overview_user_nav"},sterling_reporting_details:{id:227,name:"sterling_reporting_details_user_nav"},merchant_catalogs_data_sources:{id:228,name:"merchant_catalogs_data_sources_user_nav"},merchant_catalogs_product_groups:{id:229,name:"merchant_catalogs_product_groups_user_nav"},merchant_catalogs_listings:{id:230,name:"merchant_catalogs_listings_user_nav"},own_profile:r,other_profile:i,visual_search:{id:44,name:"visual_search_page_render"}}},client_route_replace:{unauth:{},auth:{own_profile:r,other_profile:i,sterling_reporting_overview:{id:226,name:"sterling_reporting_overview_user_nav"},sterling_ads_edit:{id:225,name:"sterling_edit_flow_user_nav"},merchant_catalogs_data_sources:{id:228,name:"merchant_catalogs_data_sources_user_nav"},merchant_catalogs_product_groups:{id:229,name:"merchant_catalogs_product_groups_user_nav"},merchant_catalogs_listings:{id:230,name:"merchant_catalogs_listings_user_nav"}}}},o={initial_app_load:{auth:{pin_closeup:{product_detail_page:{id:120,name:"product_details_interactive"},product_detail_page_plus:{id:121,name:"product_details_plus_interactive"}}}},client_route_push:{auth:{pin_closeup:{story_pin:{id:700,name:"story_pin_closeup"},product_detail_page:{id:37,name:"product_details_render"},product_detail_page_plus:{id:38,name:"product_details_plus_render"}}}},client_route_replace:{auth:{pin_closeup:{product_detail_page:{id:37,name:"product_details_render"},product_detail_page_plus:{id:38,name:"product_details_plus_render"}}}}},l={board_picker:16,grid_bottom_spinner:12,facebook_autologin:500,google_autologin:501,story_pin_step:701},s=e=>{var t,n;let{navigationType:r,isAuthenticated:i,segment:l,surface:s}=e,u=i?"auth":"unauth",d=null===(t=o[r])||void 0===t?void 0:null===(n=t[u])||void 0===n?void 0:n[s],c=l&&d&&d[l]||a[r][u][s];return c},u=e=>{if("stopwatch"===e.type)return l[e.name]||null;let t=s(e);return t?t.id:null},d=e=>{if("stopwatch"===e.type)return e.name;let{navigationType:t,isAuthenticated:n,segment:r,surface:i}=e,a=s(e);return a?a.name:`${t}_${n?"auth":"unauth"}_${i}${r?"_"+r:""}`}},383434:(e,t,n)=>{n.d(t,{Ex:()=>o,XV:()=>a,v5:()=>i});var r=n(7789);let i=(e,t)=>{r.DQ&&(e.style.outline=`10px solid ${t}`,e.style.outlineOffset="-30px")},a=e=>(t,...n)=>{r.DQ&&console.log("string"==typeof t?`[PWT:${e}] ${t}`:t,...n)},o=e=>t=>{r.jn&&console.log(`[CWV:${e}] ${String(t)}`)}},317672:(e,t,n)=>{n.d(t,{F9:()=>p,LM:()=>u,VZ:()=>a,cQ:()=>m,rZ:()=>o});var r=n(91885),i=n(790348);let a=()=>"number"==typeof window.innerHeight&&"number"==typeof window.pageYOffset&&!!document.querySelector&&!!document.querySelectorAll,o=e=>e instanceof HTMLDivElement||e instanceof HTMLVideoElement?e.getBoundingClientRect():e.parentElement instanceof HTMLElement?e.parentElement.getBoundingClientRect():null,l=({top:e,height:t},{foldY:n,pageYOffset:r})=>{let i=e+r;if(i>=n)return!1;let a=Math.min(t,n-i);return a>.5*t||a>.2*n},s=e=>{if(e instanceof HTMLImageElement)return e.src;if(e instanceof HTMLVideoElement)return e.attributes.poster.value;let t=(e.style||{}).backgroundImage||"",n=t.match(/^url\(["'](.*)["']\)$/);return n&&n[1]||null},u=()=>document.querySelector?document.querySelectorAll(r.wc).length:((0,i.H)("missing_document_query_selector"),0),d=()=>{if(!document.querySelector)return(0,i.H)("missing_document_query_selector"),null;let e=document.querySelectorAll(r.wc);return e[e.length-1]||null},c=(e,t)=>{let n=o(e);if(!n)return(0,i.H)("missing_client_rect"),!1;if(n.width<100&&n.height<100){let t=e instanceof HTMLImageElement;if(t)return!1;let n=s(e);if(null!=n&&n.endsWith("svg"))return!1}return l(n,t)},p=()=>{let e=d();if(!e)return!1;let t=window.innerHeight||0,n=window.pageYOffset||0,r=e.getBoundingClientRect().top+n>=t;return r},m=(e,t,n)=>{if(!document.querySelector)return(0,i.H)("missing_document_query_selector"),[];let a={foldY:window.innerHeight||0,pageYOffset:window.pageYOffset||0},o=[r.Wf,...e?[r.fF]:[],...t?[r.$N]:[]].join(","),l=[...document.querySelectorAll(o)];if(n){let e=[...document.querySelectorAll('div[data-test-id="board-section"]')],t=e=>{let n=[...e.children];!n.length&&e.style.backgroundImage?l.push(e):n.length&&n.forEach(e=>{t(e)})};e.forEach(e=>{t(e)})}return l.reduce((e,n)=>{if((n instanceof HTMLImageElement||n instanceof HTMLDivElement||n instanceof HTMLVideoElement&&t)&&c(n,a)){let t=s(n);if(t){let r=(t||"").replace(/.*\//,"");return e.concat([{element:n,fileName:r}])}}return e},[])}},91885:(e,t,n)=>{n.d(t,{$N:()=>u,Kb:()=>r,Wf:()=>l,fF:()=>s,wc:()=>o});let r="pwt-grid-item",i=`div[data-test-id="${r}"]`,a=['div[data-grid-item="true"]',"div.Grid__Item",i],o=a.join(","),l=a.map(e=>`${e} img`).join(","),s=a.map(e=>`${e} div[style*=background-image]`).join(","),u=a.map(e=>`${e} video`).join(",")},969853:(e,t,n)=>{n.d(t,{Z:()=>h,v:()=>m});var r=n(667294),i=n(226464),a=n(383434),o=n(317672),l=n(790348),s=n(543059),u=n(276602),d=n(22773),c=n(35954);let p=(0,a.XV)("GridProfiler"),m=()=>!!window.addEventListener&&!!window.removeEventListener&&(0,o.VZ)(),_=e=>"LAYOUT"===e.status&&500||"TIMING"===e.status&&100||null,g=(e,t)=>{if(!t){let t=(0,o.LM)();if(t===e)return p("No new items, so skip the viewport-fill check."),{complete:!1,numOfItemsChecked:e};if(!(0,o.F9)())return p("Viewport may not be filled yet."),{complete:!1,numOfItemsChecked:t}}return{complete:!0}},f=(e,t)=>{let n=0,r=0,i=0,a=0,o=0;return e=e.filter(e=>"pin"===e.type),t.forEach((t,l)=>{var s,u,d,c,p,m;let _;let g=t.fileName.split(".")[0];g!==(null===(s=_=e[l])||void 0===s?void 0:s.image_signature)&&(_=e.find(e=>g===(null==e?void 0:e.image_signature))),void 0===_?o+=1:_.is_promoted||(null===(u=_.recommendation_reason)||void 0===u?void 0:u.reason)==="PROMOTED_PIN"||null!==(d=_)&&void 0!==d&&null!==(c=d.promoter)&&void 0!==c&&c.length?i+=1:null!==_.story_pin_data_id&&void 0!==_.story_pin_data_id?n+=1:null!==(p=_)&&void 0!==p&&null!==(m=p.videos)&&void 0!==m&&m.video_list?r+=1:a+=1}),{storyPinCount:n,videoCount:r,adCount:i,imageCount:a,unknownCount:o}},v=(e,t)=>{let n=()=>{window.removeEventListener(e,n),t()};return window.addEventListener(e,n),()=>window.removeEventListener(e,n)};function h({isAtEndOfFeed:e,pinData:t,includeBackgroundImages:n,includeVideos:m=!1,includeSections:h}){let w=(0,u.E)(),y=null==w?void 0:w.getId(),S=null==w?void 0:w.setVisuallyCompleteResult,[b,E]=(0,r.useState)({status:"DISABLED"});(0,r.useEffect)(()=>{S?E({status:"LAYOUT",failedCount:0,numOfItemsChecked:0}):E({status:"DISABLED"})},[y,S]),(0,r.useEffect)(()=>{if("DISABLED"!==b.status&&(0,s.ZP)(`GridVisuallyCompleteProfiler_${b.status}`),p("new status",b),"LAYOUT"===b.status){let e=v("scroll",()=>{(0,s.ZP)("scrollDuringLayout")});return()=>{e()}}return()=>{}},[b.status]),(0,c.Z)(()=>{if(!w||!S)return;let{abort:r,getMetricId:s}=w,u=s();switch(b.status){case"LAYOUT":{let t=g(b.numOfItemsChecked,e);t.complete?E({status:"TIMING",failedCount:0,pinElements:(0,o.cQ)(n,m,h)}):500*b.failedCount>6e4?((0,l.A9)(`images.${(0,i.KJ)(u)}.visuallyComplete.maxLayoutAttempt`),r("visuallyComplete_layoutTimeout"),E({status:"DISABLED"})):E({...b,failedCount:b.failedCount+1,numOfItemsChecked:t.numOfItemsChecked});break}case"TIMING":{let e=(0,d.Cg)(),n=b.pinElements.length,o=[],s=0,c=0,m=0;if(b.pinElements.forEach(({element:t,fileName:n})=>{let r=e.find(e=>e.name.endsWith(n));r?r.responseEnd?(o.push(r),(0,a.v5)(t,"green")):(m+=1,(0,a.v5)(t,"blue")):t instanceof HTMLImageElement&&t.complete?(c+=1,(0,a.v5)(t,"red")):(s+=1,(0,a.v5)(t,"greenyellow"))}),s||m)100*b.failedCount>6e4?((0,l.A9)(`images.${(0,i.KJ)(u)}.visuallyComplete.maxAttempt`,{tags:{totalImageCount:n,incompleteCount:s,noTimingCount:c,noTimingResponseEndCount:m}}),r("visuallyComplete_timingTimeout"),E({status:"DISABLED"})):E({...b,failedCount:b.failedCount+1});else{if(p(`All ${o.length} images are fetched`),t&&t.length){let e=f(t,b.pinElements);Object.entries(e).forEach(([e,t])=>{w.addBinaryAnnotation(e,t,"I16")}),(0,l.A9)(`${(0,i.KJ)(u)}.pinTypes`,{tags:e})}S({imageTimings:o}),E({status:"DISABLED"}),(0,l.A9)(`images.${(0,i.KJ)(u)}.visuallyComplete.complete`,{tags:{totalImageCount:n,noTimingCount:c}})}}}},_(b))}},790348:(e,t,n)=>{n.d(t,{A9:()=>p,DG:()=>d,H:()=>m,S$:()=>_,iF:()=>c});var r=n(7789),i=n(383434),a=n(50286),o=n(67347);let l=(0,i.XV)("logPwtStats"),s=null,u=!0;function d(e){s={browserName:e.userAgent.browserName,browserVersion:e.userAgent.browserVersion,deviceType:(0,a.Mq)(e),isAuthenticated:e.isAuthenticated,isBot:e.isBot,isSocialBot:e.isSocialBot}}let c=e=>{s&&(s.historyAction=e)},p=(e,t={sampleRate:1},n=!0)=>{let i=r.DQ?1:t.sampleRate;if(!s){l("pwt.metrics_quality.no_context"),(0,o.nP)("pwt.metrics_quality.no_context",{sampleRate:i,tags:{eventName:e}});return}let{browserName:a,browserVersion:u,deviceType:d,isBot:c,isSocialBot:p}=s,m=`pwt.${p&&"socialBot"||c&&"bot"||"nonbot"}.metrics_quality.${d}.${e}`,_={...t.tags||{},browserName:a,browserVersion:(null==u?void 0:u.split(".")[0])||"0"},g="number"==typeof t.count?t.count:1;n&&(l(`${m}: ${g}`),t.tags&&l(Object.entries(t.tags))),r.is||(0,o.QX)(m,g,{sampleRate:i,tags:_})},m=(e,t)=>p(`ERROR.${null!=t&&t.action?t.action+".":""}${e}`,{tags:t}),_=({appLoadName:e,clientNavName:t},n)=>{if(s){let r="APP_VOLUME.";u?(p(r.concat(e),{tags:{browserSupportsPwtProfiler:!!n}}),u=!1):"PUSH"===s.historyAction&&p(r.concat(t),{tags:{browserSupportsPwtProfiler:!!n}})}else(0,o.nP)("pwt.metrics_quality.no_context",{sampleRate:1,tags:{eventName:e.concat(`.${t}`)}})}},543059:(e,t,n)=>{n.d(t,{Ao:()=>c,BA:()=>p,L8:()=>_,ZP:()=>g,at:()=>i,gQ:()=>d,tl:()=>m});var r=n(985271);let i="masonryPagination",a={},o=e=>`📌 ${e}`,l=(e,t)=>{let n=o(t);e.mark(n)},s=(e,t,n,r)=>{let i=o(t);e.measure(i,n,r)},u=(e,t)=>{let n=o(t);e.clearMarks(n),e.clearMeasures(n)},d=()=>{let e={};return Object.keys(a).forEach(t=>{(a[t]||[]).slice(0,3).forEach((n,r)=>{let i=r?`${t}_${r+1}`:t;e[i]=n})}),e},c=(e,t)=>(a[e]||[]).filter(e=>e<t).length,p=(e,t)=>c(e,t)>0,m=()=>{r.Z&&Object.keys(a).forEach(e=>u(r.Z,e)),a={}},_=e=>{r.Z&&(a[e]=(a[e]||[]).concat([r.Z.now()]),s(r.Z,e))},g=e=>{r.Z&&(a[e]=(a[e]||[]).concat([r.Z.now()]),l(r.Z,e))}},528961:(e,t,n)=>{n.d(t,{cC:()=>a,jy:()=>i,qr:()=>l,sk:()=>o});let r=e=>"number"==typeof e?Math.round(e):e,i=e=>({type:"I16",value:r(e)}),a=e=>({type:"I32",value:r(e)}),o=e=>({type:"STRING",value:e}),l=e=>({type:"BOOL",value:e})},638089:(e,t,n)=>{n.d(t,{ng:()=>h,rA:()=>y});var r=n(226464),i=n(543059),a=n(528961),o=n(156381),l=n(22773),s=n(602738);let u=(e,t)=>(e||[]).reduce((e,n)=>({...e,[`experiment.${n}`]:(0,a.sk)(t(n))}),{}),d=(e,t)=>"number"==typeof t?e(t):null,c=e=>Number(Number(e/1024).toFixed(3)),p=e=>e.reduce((e,t)=>e+t,0),m=(e,t)=>Object.keys(t).reduce((n,r)=>({...n,[`${e}${r}`]:t[r]}),{}),_=e=>{if(!e.length)return{};let t=e.map(({startTime:e,requestStart:t,responseStart:n,responseEnd:r})=>{let i=t||e;return{startTime:e,requestStart:i,responseStart:n||i,responseEnd:r}}),n=p(t.map(e=>e.requestStart-e.startTime)),r=p(t.map(e=>e.responseStart-e.requestStart)),i=p(t.map(e=>e.responseEnd-e.responseStart)),o=n+r+i,l=p(e.map(e=>e.decodedBodySize||0));return{decodedBodySize:(0,a.cC)(c(l)),"duration.all":(0,a.cC)(o),"duration.requestStartToResponseStart":(0,a.cC)(r),"duration.responseStartToResponseEnd":(0,a.cC)(i),"duration.startToRequestStart":(0,a.cC)(n)}},g=e=>{let t=e.filter(e=>!!e.responseEnd);return{...e.length?{..._(t),"count.completed":(0,a.cC)(t.length)}:{},"count.all":(0,a.cC)(e.length)}},f=e=>{let t=["timeSecond1","timeSecond2","timeSecond3"],n={timeSecond1:{start:0,end:0,count:0},timeSecond2:{start:0,end:0,count:0},timeSecond3:{start:0,end:0,count:0}},r={script_deferred:[],external:[],visually_complete:[],script:[],css:[],video:[],image:[],xmlhttprequest:[],other:[]};if(e.length){let{requestStart:i,startTime:a}=e[0].timing,o=i||a;n.timeSecond1.start=o,n.timeSecond1.end=o+1e3,n.timeSecond2.start=o+1e3,n.timeSecond2.end=o+2e3,n.timeSecond3.start=o+2e3,n.timeSecond3.end=o+3e3,e.forEach(e=>{let{timing:i}=e;r[e.category]=r[e.category].concat([i]),e.isDeferred&&(r.script_deferred=r.script_deferred.concat([i])),e.isExternal&&(r.external=r.external.concat([i])),e.isVisuallyCompleteRequired&&(r.visually_complete=r.visually_complete.concat([i]));let{requestStart:a,startTime:o,responseEnd:l}=i,s=a||o;t.forEach(e=>{let{start:t,end:r}=n[e];s>=t&&s<r?n[e].count+=1:s<t&&l>t&&(n[e].count+=1)})})}let i={...m("concurrentRequests.",Object.keys(n).reduce((e,t)=>e={...e,[t]:(0,a.cC)(n[t].count)},{}))},o={...Object.keys(r).reduce((e,t)=>({...e,...m(`resource.${t}.`,g(r[t]))}),i)};return o},v=(e,t,n)=>{var i,o;let u;let{devicePixelRatio:c,navigator:p,innerWidth:m,innerHeight:_,performance:g}=window,{deviceMemory:f,hardwareConcurrency:v,platform:h,userAgent:w,connection:y}=p,{memory:S}=g,{appType:b,appVersion:E,browserName:T,browserVersion:k,deviceType:C,isAppShell:A,isAuthenticated:$,isBot:L,isSocialBot:Z,locale:B,osName:I,stageName:M}=t,O="desktop"===C?b||5:b||6,{navigationType:D}=e,q=null;if("initial_app_load"===D){u=1;let e=null===(o=(0,s.Z)("navigation")[0])||void 0===o?void 0:o.transferSize;q=e?parseFloat((.001*e).toFixed(1)):null}else u=4;return{"app.type":(0,a.jy)(O),"app.version":(0,a.sk)(E),"browser.name":(0,a.sk)(T),"browser.version":(0,a.sk)(k),"cpu.speed":(0,a.jy)(v),"device.memory":(0,a.jy)(f),"device.type":(0,a.jy)(0),"device.typeName":(0,a.sk)(C),"device.version":(0,a.sk)("unknown"),"pwt.cause":(0,a.jy)(u),"net.effectiveType":(0,a.sk)((null==y?void 0:y.effectiveType)||null),"net.downlink":(0,a.cC)(d(e=>10*Math.round(e/10),null==y?void 0:y.downlink)),"net.downlinkMax":(0,a.cC)(d(e=>10*Math.round(e/10),null==y?void 0:y.downlinkMax)),"net.rtt":(0,a.cC)(d(e=>10*Math.round(e/10),null==y?void 0:y.rtt)),"net.speed":(0,a.cC)((0,l.Hv)(n,!1)),"pwt.result":(0,a.jy)(1),"view.type":(0,a.cC)(0),"viewport.height":(0,a.cC)(_||0),"viewport.width":(0,a.cC)(m||0),devicePixelRatio:(0,a.cC)(c||0),isAppShell:(0,a.qr)(A),isAuthenticated:(0,a.qr)($),isBot:(0,a.qr)(L),isSocialBot:(0,a.qr)(Z),locale:(0,a.sk)(B),osName:(0,a.sk)(I),...null!==q&&{htmlResponseSize:(0,a.cC)(q)},nextHopProtocol:(0,a.sk)((null===(i=(0,s.Z)("navigation")[0])||void 0===i?void 0:i.nextHopProtocol)||null),platform:(0,a.sk)(h||null),profilerVersion:(0,a.sk)("3"),pwtActionName:(0,a.jy)((0,r.Rp)(e)),stageName:(0,a.sk)(M),userAgent:(0,a.sk)(w),usedJSHeapSize:(0,a.cC)((null==S?void 0:S.usedJSHeapSize)||0),totalJSHeapSize:(0,a.cC)((null==S?void 0:S.totalJSHeapSize)||0),jsHeapSizeLimit:(0,a.cC)((null==S?void 0:S.jsHeapSizeLimit)||0)}},h=({annotateExperiments:e,metricId:t,pwtStaticContext:n,binaryAnnotations:r={},performanceResourceTimings:i=[]})=>({...u(e,n.getExperimentGroup),...v(t,n,i),...r,stopwatchVersion:(0,a.jy)(1)}),w=(e,t)=>{var n;let{navigator:r}=window,{serviceWorker:l}=r,{surface:s,navigationType:u,isAuthenticated:d}=e,{cumulativeLayoutShiftScore:c,longTaskDurations:m}=(0,o.v2)();return{...m.length?{"longTask.count":(0,a.cC)(m.length),"longTask.maxDuration":(0,a.cC)(Math.max(...m)),"longTask.totalDuration":(0,a.cC)(p(m))}:{},cumulativeLayoutShiftScore:(0,a.cC)(100*c),"masonry.paginationMarkCount":(0,a.cC)((0,i.Ao)(i.at,t)),"metricId.isAuthenticated":(0,a.qr)(d),"metricId.navigationType":(0,a.sk)(u),"metricId.surface":(0,a.sk)(s),resourceBufferClearedCount:(0,a.jy)((0,i.Ao)("resourceBufferCleared",t)),scrollDuringLayout:(0,a.qr)((0,i.BA)("scrollDuringLayout",t)),serviceWorker:(0,a.qr)(l?!!l.controller:null),serviceWorkerState:(0,a.sk)((null==l?void 0:null===(n=l.controller)||void 0===n?void 0:n.state)||null)}},y=({annotateExperiments:e,binaryAnnotations:t={},entries:n,metricId:r,performanceResources:i,pwtEndTime:a,pwtStaticContext:o})=>({...t,...f(i),...u(e,o.getExperimentGroup),...v(r,o,n),...w(r,a)})},860273:(e,t,n)=>{n.d(t,{Z:()=>i});var r=n(985271);let i=()=>{let[e]=r.Z?r.Z.getEntriesByType("navigation"):[];return e}},453821:(e,t,n)=>{n.d(t,{i:()=>r,p:()=>o});let r=({name:e,initiatorType:t})=>{switch(t){case"xmlhttprequest":return"xmlhttprequest";case"img":return"image";case"video":return"video";default:{let t=e.split("."),n=(t.length>1&&t.pop()||"").toLowerCase();if(["js","mjs"].includes(n))return"script";if("css"===n)return"css";if(["mp4","m4v","mov","ts","m3u8"].includes(n))return"video";if(["bmp","gif","jpg","jpeg","png","tiff","webp","svg"].includes(n))return"image";return"other"}}},i=e=>{let t=e.replace(RegExp(`^${window.location.origin||""}`),""),n=document&&document.querySelector(`script[src='${t}']`);return!!n&&n.hasAttribute("defer")},a=e=>["pinimg","pinterest","pinterdev"].every(t=>!e.includes(`${t}`)),o=(e,t)=>{let n=r(e),{name:o}=e;return{category:n,isDeferred:"script"===n&&i(o),isExternal:a(o),isVisuallyCompleteRequired:"image"===n&&t.includes(o),timing:e}}},558775:(e,t,n)=>{n.d(t,{Z:()=>k});var r=n(176532),i=n(7789),a=n(226464),o=n(383434),l=n(790348);let s=null,u=(e,t)=>((s=s||{results:[],context:t}).results.push(e),s);var d=n(528961),c=n(860273),p=n(358864),m=n(602738);let _=(e,t)=>Object.keys(e).reduce((n,r)=>{let i=e[r];return i?{...n,[r]:{timestamp:t+i}}:n},{}),g=e=>Object.keys(e).reduce((t,n)=>{let r=e[n];if(!r)return t;let{value:i,type:a}=r;return null==i?t:t.concat({name:n,value:i,annotation_type:a})},[]),f=({span:e,timeOrigin:t})=>({id:e.id,parent_id:e.parentId||null,result:1,name:e.name,timestamp:t+e.startTime,duration:e.endTime-e.startTime,annotations:_(e.annotationMap,t),binary_annotations:g(e.binaryAnnotationMap)}),v=(e,{startTime:t,endTime:n,annotationMap:r,binaryAnnotationMap:i,parentId:a,traceId:o})=>({name:`pwt/${e}`,startTime:t,endTime:n,annotationMap:r,binaryAnnotationMap:i,parentId:a,id:o}),h=({annotations:e})=>e.reduce((e,{key:t,timestamp:n})=>({...e,[`server_${t}`]:{timestamp:n}}),{}),w=(e,t)=>({...e,annotations:{...h(t),...e.annotations},binary_annotations:[...t.binary_annotations,...e.binary_annotations]}),y=(e,t,n)=>{var r;let i=(0,c.Z)(),a=null==i?void 0:i.responseEnd;return a?w(f({span:{name:"html",startTime:0,endTime:(null==i?void 0:i.responseEnd)||1,annotationMap:{},binaryAnnotationMap:{nextHopProtocol:(0,d.sk)((null===(r=(0,m.Z)("navigation")[0])||void 0===r?void 0:r.nextHopProtocol)||null)},id:e.server_span_id||(0,p.Z)(),parentId:t},timeOrigin:n}),e):null},S=({traceId:e,actionName:t,result:n,timeOrigin:r,serverDataToJoin:i})=>{let a=f({span:v(t,n),timeOrigin:r}),o=null;return i&&(a=w(a,i),o=y(i,e,r)),{trace_id:e,spans:[a,...o?[o]:[],...n.spans.map(e=>f({span:e,timeOrigin:r}))]}},b=e=>({debugTrace:i.eD,locale:e.locale,stageName:e.stageName}),E=(0,o.XV)("reportResult"),T=()=>{var e;return null!==(e=window.performance)&&void 0!==e&&e.now?Date.now()-window.performance.now():"unknown"};function k({metricId:e,pwtStaticContext:t,result:n,isAuth:o}){let{serverData:s}=t,d=(0,a.KJ)(e),c=`${n.type}.${d}`,p=`${n.type}.sampled.${d}`,m=void 0!==o&&{tags:{isAuth:o}}||void 0;if((0,l.A9)(n.reason?c.concat(`.${n.reason}`):c,m),(0,l.A9)(n.reason?p.concat(`.${n.reason}`):p,{...m,sampleRate:.5}),"COMPLETE"!==n.type){E(`Abort metric ${d}`,n);return}let _=T();if("unknown"===_){E(`Unable to convert to absolute times for ${d} due to missing time origin`),(0,l.A9)(`missingTimeOrigin.${d}`,m);return}if(i.is&&(window.PWT_LAB_DATA=u(n,t)),n.spans.length&&(n.spans=n.spans.map(e=>(e.parentId||e.id===n.traceId||"network_resources"===e.name||(e.parentId=n.traceId),e))),!i.is){let i=e.navigationType&&"initial_app_load"===e.navigationType,{traceId:a}=n,o=S({traceId:a,actionName:d,result:n,timeOrigin:_,serverDataToJoin:i&&s||null});(0,r.Z)({type:"POST",url:"/_/_/trace/trace/",data:{report_data:JSON.stringify(o),report_context:JSON.stringify(b(t))}}),E(`PinTrace ${d} will be available shortly: https://pintrace.pinadmin.com/zipkin/traces/${a.toString(16)}`,{duration:n.endTime-n.startTime,result:n,pwtStaticContext:t})}}},156381:(e,t,n)=>{let r;n.d(t,{Bn:()=>_,Kj:()=>m,PJ:()=>u,UQ:()=>f,Ux:()=>d,on:()=>l,v2:()=>c});var i=n(581341),a=n(169213);let o={cumulativeLayoutShiftScore:0,longTaskDurations:[],largestContentfulPaint:null,elementTimings:[]},l=()=>{o.longTaskDurations=[]},s=(0,i.Z)(()=>o.elementTimings),u=()=>s.get(),d=e=>{e&&s.save(),o.elementTimings=[]},c=()=>o,p=0,m=()=>p,_=()=>r,g=e=>e.reduce((e,{identifier:t,loadTime:n,renderTime:r})=>e.concat("string"==typeof t&&"number"==typeof n&&"number"==typeof r?[{identifier:t,loadTime:n,renderTime:r}]:[]),[]),f=()=>{(0,a.Z)({type:"element",buffered:!0},e=>{o.elementTimings=o.elementTimings.concat(g(e.getEntries()))}),(0,a.Z)({entryTypes:["longtask"]},e=>{e.getEntries().map(e=>o.longTaskDurations.push(e.duration))},()=>l()),(0,a.Z)({type:"largest-contentful-paint",buffered:!0},e=>{let t=e.getEntries(),n=t.length,i=t[n-1];i&&(p=n,o.largestContentfulPaint=i.renderTime||i.loadTime||null,r=i.renderTime||i.loadTime||null)}),(0,a.Z)({type:"layout-shift",buffered:!0},e=>{let t=e.getEntries();t.forEach(e=>{e.hadRecentInput||(o.cumulativeLayoutShiftScore+=e.value)})})}},581341:(e,t,n)=>{n.d(t,{Z:()=>r});let r=e=>{let t=null;return{get:()=>t||e(),save:()=>{t=e()}}}},169213:(e,t,n)=>{n.d(t,{Z:()=>r});let r=(e,t,n)=>{if(!window.PerformanceObserver)return null;try{let r=new window.PerformanceObserver(t);return r.observe(e),window.addEventListener("beforeunload",()=>{r.disconnect()}),n&&window.addEventListener("popstate",()=>{n()}),r}catch(e){return null}}},358864:(e,t,n)=>{n.d(t,{Z:()=>r});function r(){let e="";for(let t=0;t<15;t+=1){let t=Math.floor(10*Math.random());e+="0123456789"[t]}return Number(e)}},22773:(e,t,n)=>{let r;n.d(t,{Cg:()=>g,Eg:()=>v,Hv:()=>y,LH:()=>h,MM:()=>S,X_:()=>p,y0:()=>f});var i=n(7789),a=n(790348),o=n(543059),l=n(453821),s=n(581341),u=n(169213),d=n(602738);function c(){window.performance&&window.performance.clearResourceTimings&&((0,o.ZP)("resourceBufferCleared"),i.DQ&&console.info("Warning: Clearing resource timings in default buffer."),(0,a.A9)("resourceBufferSize",{count:(0,d.Z)("resource").length}),window.performance.clearResourceTimings())}let p=({size:e})=>{if(window.performance){window.PerformanceObserver?(r=(0,d.Z)("resource"),(0,u.Z)({entryTypes:["resource"]},t=>{(r=(r||[]).concat(t.getEntries())).length>e&&(r=r.slice(-e))})):(window.addEventListener("popstate",()=>{let t=(0,d.Z)("resource").length;t>e&&c()}),window.performance.setResourceTimingBufferSize&&window.performance.setResourceTimingBufferSize(e));try{window.performance.onresourcetimingbufferfull=()=>{r||c()}}catch(e){}}},m=()=>r||(0,d.Z)("resource"),_=(0,s.Z)(m),g=m,f=()=>_.get(),v=e=>{e&&_.save(),r&&((0,a.A9)("customBufferSize",{count:r.length}),r=[]),c()},h=()=>({customBufferSize:r?r.length:0,defaultBufferSize:(0,d.Z)("resource").length}),w=e=>e.length?e.reduce((e,t)=>e+t,0)/e.length:null,y=(e,t=!0)=>{let n=0,r=0,i=w(e.filter(e=>{if(t){let t="image"===(0,l.i)(e);return!!t&&(e.responseEnd||(n+=1),e.transferSize||(r+=1),!!e.responseEnd&&!!e.transferSize)}return!!e.responseEnd&&!!e.transferSize}).map(e=>{let t=8*(e.transferSize||0),n=(e.responseEnd-e.responseStart)/1e3;return t/n/1e3}));return t&&(n>0&&(0,a.A9)("images.downloadSpeed.noResponseEnd",{tags:{count:n}},!1),r>0&&(0,a.A9)("images.downloadSpeed.transferSize",{tags:{count:r}},!1)),i},S=e=>{if(!e)return"unknown";let t=Math.floor(e/1e3);return t<1?"0-1":t<5?"1-5":t<10?"5-10":t<20?"10-20":t<40?"20-40":t<80?"40-80":"80_or_above"}},602738:(e,t,n)=>{n.d(t,{Z:()=>r});function r(e){var t,n;return(null===(t=window)||void 0===t?void 0:null===(n=t.performance)||void 0===n?void 0:n.getEntriesByType)&&window.performance.getEntriesByType(e)||[]}},985271:(e,t,n)=>{var r;n.d(t,{Z:()=>i});let i=(r=window.performance)&&r.clearMarks&&r.clearMeasures&&r.clearResourceTimings&&r.getEntries&&r.getEntriesByName&&r.getEntriesByType&&r.mark&&r.measure&&r.now&&r.setResourceTimingBufferSize?r:null},932046:(e,t,n)=>{n.d(t,{Z:()=>i});var r=n(826067);function i(){let e=(0,r.mB)(window.location.search);if("31"===e.utm_source)return"email";if(e.utm_pai)return"paid";let t=document.referrer;return t?t.includes("/t.co/")?"twitter":t.includes("cdn.ampproject.org")?"amp":t.includes("google.")?"google":t.includes("bing.")?"bing":t.includes("facebook.")?"facebook":"other":"direct"}},35954:(e,t,n)=>{n.d(t,{Z:()=>i});var r=n(667294);let i=(e,t)=>{let n=(0,r.useRef)(()=>{});(0,r.useEffect)(()=>{n.current=e},[e]),(0,r.useEffect)(()=>{if(null===t)return()=>{};let e=setInterval(()=>n.current(),t);return()=>clearInterval(e)},[t])}}}]);
//# sourceMappingURL=https://sm.pinimg.com/webapp/13254-1f255b6536cdadfe.mjs.map