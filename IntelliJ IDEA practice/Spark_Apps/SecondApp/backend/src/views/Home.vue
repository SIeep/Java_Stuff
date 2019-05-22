<template>
  <div class="home">
    <h1>{{myName}}</h1>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
    data: function() {
      return {
        myName: "Brandon"
      };
    },
  name: 'home',
  components: {
    HelloWorld
  }
}
</script>
