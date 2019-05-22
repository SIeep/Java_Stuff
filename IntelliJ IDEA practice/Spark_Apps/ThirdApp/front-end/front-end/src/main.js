import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import axios from "axios";

Vue.config.productionTip = false;

axios.defaults.baseURL =
    process.env.NODE_ENV === "development" ? "http://localhost:4567" : "/";

new Vue({
  router,
  render: h => h(App)
}).$mount("#app");
